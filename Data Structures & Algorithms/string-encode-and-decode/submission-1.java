class Solution {
    public static int[] index = new int[100];
    public static int num = 0;
    public String encode(List<String> strs) {
        if(strs.size() == 0) {
            return null;
        }
        String ans = strs.get(0);
        index[0] = 0;
        num = 1;
        for(int i = 1; i < strs.size(); i++) {
            index[i] = ans.length();
            ans += strs.get(i);
            num++;
        }
        System.out.print(ans);
        return ans;
    }

    public List<String> decode(String str) {
        if(str == null) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        int i = 0;
        for(i = 0; i < num - 1; i++) {
            list.add(str.substring(index[i], index[i+1]));
        }
        list.add(str.substring(index[i]));
        return list;
    }
}
