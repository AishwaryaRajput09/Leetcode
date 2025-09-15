class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String arr[] = text.split(" ");
        int cnt = 0;
           for(String s: arr){
            boolean isP = true;
        for(char ch: brokenLetters.toCharArray()){
            if(s.indexOf(ch)!= -1){
                isP = false;
                break;
            }
           }
           if(isP){
            System.out.println(s);
            cnt++;
           }
        }
        return cnt;
    }
}