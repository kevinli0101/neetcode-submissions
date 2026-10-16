class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int st = 0;
        int e = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(set.contains(c)) {
                while(s.charAt(st) != c) {
                    set.remove(s.charAt(st));
                    st++;
                }
                st++;
            }
            e++;
            set.add(c);
            max = Math.max(max, e - st);
        }
        return max;
    }
}
