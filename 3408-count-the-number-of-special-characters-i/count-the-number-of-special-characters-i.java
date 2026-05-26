class Solution {
    public int numberOfSpecialChars(String word) {
        boolean [] lowerCase = new boolean[26];
        boolean [] upperCase = new boolean[26];
        int cnt = 0;
        for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch)){
                lowerCase[ch - 'a'] = true;
            }else{
                upperCase[ch - 'A'] = true;
            }
        }
        for(int i = 0; i < 26; i++){
            if(upperCase[i] && lowerCase[i]){
                cnt++;
            }
        }
        return cnt;
    }
}