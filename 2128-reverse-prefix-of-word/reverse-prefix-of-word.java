class Solution {
    public String reversePrefix(String word, char ch) {
        int end = 0;
        String st = "";
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                end = i;
                break;
            }
        }
        int i = 0;
        char[] c = new char[word.length()];
        for(char k : word.toCharArray()){
            c[i++] = k;
        }
        int s = 0;
        while(s < end){
            swap(c,s++,end--);
        }
        for(char k : c){
            st += k;
        }
        return st;

    }
    private void swap(char[] c, int s,int e){
        char temp = c[s];
        c[s] = c[e];
        c[e] = temp;
    }
}