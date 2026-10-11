class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int pro = 1;
        int count0 = 0;
        int indexof0 = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count0++;
                indexof0 = i;
                continue;
            }
            pro*=nums[i];
        }
        if (count0 == 0) {
            for(int i = 0; i < nums.length; i++) {
                ans[i] = pro / nums[i];
            }
        } else if (count0 == 1) {
            ans[indexof0] = pro;
        }
        return ans;
    }
}  
