class Solution {
    public int appendCharacters(String s, String t) {
        int st1 = 0;
        int st2 = 0;
        int cnt = 0;
        while(st1 < s.length() && st2 < t.length()){
            if(s.charAt(st1) == t.charAt(st2)){
                cnt++;
            st1++;
            st2++;
            }else{
                st1++;
            }
        }
        return t.length() - cnt;
    }
}