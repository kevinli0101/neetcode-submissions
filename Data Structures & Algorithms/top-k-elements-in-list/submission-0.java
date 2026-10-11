class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] list = new ArrayList[nums.length + 1];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int num = nums[i];

            while (i + 1 < nums.length && nums[i + 1] == num) {
                i++;
                count++;
            }

            if (list[count] == null) {
                list[count] = new ArrayList<>();
            }

            list[count].add(num);
        }

        int[] ans = new int[k];
        int count = 0;

        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] != null) {
                for (int j = 0; j < list[i].size(); j++) {
                    ans[count] = list[i].get(j);
                    count++;

                    if (count == k) {
                        return ans;
                    }
                }
            }
        }

        return ans;
    }
}
