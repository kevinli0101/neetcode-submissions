class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int s = 0;
        int e = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[s]) {
                max = Math.max(prices[e] - prices[s], max);
                s = i;
                e = i;
            }
            max = Math.max(prices[i] - prices[s], max);
            e++;
        }
        return max;
    }
}
