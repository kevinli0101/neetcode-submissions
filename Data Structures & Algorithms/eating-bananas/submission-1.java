class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i = 1; i < piles.length; i++) {
            if(piles[i] > max) {
                max = piles[i];
            }
        }
        int s = 1;
        int e = max;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            int num = 0;
            for(int i = 0; i < piles.length; i++) {
                num = num + (piles[i] + mid - 1) / mid;
            }
            if(num > h) {
                s = mid + 1;
            } else {
                if (mid == 1) {
                    return 1;
                }
                num = 0;
                for (int i = 0; i < piles.length; i++) {
                    num += (piles[i] + (long) mid - 2) / (mid - 1);
                }
                if (num > h) {
                    return mid;
                } else {
                    e = mid - 1;
                }
            }
        }
        return 1;
    }
}
