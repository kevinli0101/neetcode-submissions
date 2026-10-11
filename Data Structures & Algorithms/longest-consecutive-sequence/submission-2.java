class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])) {
                continue;
            }
            set.remove(nums[i]);
            temp = 1;
            int ifr = nums[i];
            int ibac = nums[i];
            while(set.contains(ifr + 1)) {
                temp++;
                ifr++;
                set.remove(ifr);
            }
            while(set.contains(ibac - 1)) {
                temp++;
                ibac--;
                set.remove(ibac);
            }
            if(temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
