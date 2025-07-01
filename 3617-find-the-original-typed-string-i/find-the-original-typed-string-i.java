class Solution {
    public int possibleStringCount(String word) {
         int j = word.length()-1;
         int cnt = 1;
         while(j > 0){
            if(word.charAt(j) == word.charAt(j-1)){
                cnt++;
            }
                j--;
         }
        return cnt;
    }
}