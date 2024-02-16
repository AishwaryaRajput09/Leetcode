class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(isPal(s,i,j) && (j-i+1) > ans.length()){
                    ans = s.substring(i,j+1);
                }
            }
           }
        return ans;
    }
    public boolean isPal(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}