class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while(word.length() <= k){
            StringBuilder newStr =new StringBuilder();
            int len = word.length();
            for(int i = 0; i < len; i++){
                newStr.append((char)(word.charAt(i) + 1));
            }
            word.append(newStr);
        }
        return word.charAt(k-1);
    }
}