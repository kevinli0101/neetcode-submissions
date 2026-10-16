class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        if(nums.length == 1) {
            return nums[0];
        }
        while (s <= e) {
            if ((e - s) == 1) {
                return Math.min(nums[e], nums[s]);
            }
            int mid = s + (e - s) / 2;
            if (nums[s] < nums[mid]) {
                if (nums[mid] < nums[e]) {
                    return nums[s];
                } else {
                    s = mid + 1;
                }
            } else {
                if (nums[mid] < nums[mid - 1]) {
                    return nums[mid];
                } else {
                    e = mid - 1;
                }
            }
        }
        return nums[e];
    }
}
