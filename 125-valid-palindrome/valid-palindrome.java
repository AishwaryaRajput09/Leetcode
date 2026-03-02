class Solution {
    public boolean isPalindrome(String s) {
        String cleanedS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedS.length()-1;
        return pal(left,right,cleanedS);
    }
    boolean pal(int left,int right,String s){
        boolean fl = true;
        if(left >= right){
            return fl;
        }
        if(s.charAt(left) == s.charAt(right)){
            return pal(left+1,right-1,s);
        }else{
            return false;
        }
        
    }
}