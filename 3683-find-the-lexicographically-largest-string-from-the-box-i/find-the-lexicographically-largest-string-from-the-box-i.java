class Solution {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1) return word;
        int maxL = word.length() - numFriends + 1;
        char maxChar = 'a';

        for(char ch : word.toCharArray()){
            if(ch > maxChar) maxChar = ch;
        }

        String ans = "";
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == maxChar){
                if(i + maxL <= word.length()){
                    String sub = word.substring(i, i + maxL);
                    if(sub.compareTo(ans) > 0) ans = sub;
                }else{
                    String sub = word.substring(i);
                    if(sub.compareTo(ans) > 0) ans = sub;
                }
            }
        }
        

        return ans;
    }
}
