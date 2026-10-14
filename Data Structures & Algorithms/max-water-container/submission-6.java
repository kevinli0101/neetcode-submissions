class Solution {
    public int maxArea(int[] heights) {
        int max = area(heights, 0, heights.length - 1);
        int s = 0;
        int e = heights.length - 1;
        while(s < e) {
            if(max >= area(heights, s + 1, e) && max >= area(heights, s, e - 1)) {
                if (heights[s] > heights[e]) {
                    e--;
                } else {
                    s++;
                }
            } else if (max < area(heights, s + 1, e)){
                max = area(heights, s + 1, e);
                s++;
            } else if (max < area(heights, s, e - 1)){
                max = area(heights, s, e - 1);
                e--;
            }
        }
        return max;
    }
    public static int area(int[] heights, int s, int e) {
        return (e - s) * Math.min(heights[s], heights[e]);
    }
}
