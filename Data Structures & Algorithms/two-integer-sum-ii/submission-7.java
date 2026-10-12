class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length - 1;
        while(true) {
            int temp = target - numbers[s];
            while(numbers[e] > temp) {
                e--;
            }
            if(numbers[e] == temp) {
                int[] ans = new int[2];
                ans[0] = s + 1;
                ans[1] = e + 1;
                return ans;
            } else {
                s++;
            }
        }
    }
}
