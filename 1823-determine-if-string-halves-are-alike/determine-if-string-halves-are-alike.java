class Solution {
    public boolean halvesAreAlike(String s) {
        int cnt = 0;
        int cnt2 = 0;
        int length = s.length()/2;
        for(int i = 0 ; i < length;i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                cnt++;
            }
        }
        for(int i = length ; i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                cnt2++;
            }
        }
        return cnt == cnt2;
    }
}