class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       StringBuilder s1 = new StringBuilder();
       StringBuilder s2 = new StringBuilder();
       for(String s:word1){for(int i = 0; i< s.length();i++){
            s1.append(s.charAt(i));
       }}
       for(String s:word2){for(int i = 0; i< s.length();i++){
            s2.append(s.charAt(i));
       }}
       
       if(s1.toString().equals(s2.toString())){
           return true;
       }else{

       return false;
       }
    }
}