class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        if(nums[s] == target) {
            return s;
        }
        if(nums[e] == target) {
            return e;
        }
        while(s <= e) {
            int n = (s + e) / 2;
            if (nums[n] > target) {
                if (n == s || n == e) {
                    break;
                }
                e = n;
            } else if (nums[n] == target) {
                return n;
            } else {
                if (n == s || n == e) {
                    break;
                }
                s = n;
            }
        }
        return -1;
    }
}
