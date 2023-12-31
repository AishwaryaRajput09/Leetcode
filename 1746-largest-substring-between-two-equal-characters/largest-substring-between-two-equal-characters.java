class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // StringBuilder sub = new StringBuilder();
        int maxLength = -1;
        for(int i = 0; i < s.length();i++){
            for(int j = s.length()-1; j > i;j--){
                if(s.charAt(i) == s.charAt(j)){
                    maxLength = Math.max(maxLength,j-i-1);
                }
            }
        }
        return maxLength;
    } 
}