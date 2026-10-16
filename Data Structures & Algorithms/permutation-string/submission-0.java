class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        int countl = s1.length();
        int s = 0;
        int e = 0;
        for(int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s2.length(); i++) {
            if(count[s2.charAt(i) - 'a'] > 0) {
                count[s2.charAt(i) - 'a']--;
                countl--;
                e++;
                if(countl == 0) {
                    return true;
                }
            } else {
                while(e > s && s2.charAt(s) != s2.charAt(e)) {
                    count[s2.charAt(s) - 'a']++;
                    countl++;
                    s++;
                }
                s++;
                e++;
            }
        }
        return false;
    }
}
