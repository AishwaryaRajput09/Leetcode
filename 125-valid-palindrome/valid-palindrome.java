class Solution {
    public boolean isPalindrome(String s) {
     String sb = "";
     for(int i = 0; i < s.length(); i++){
        if(!Character.isLetterOrDigit(s.charAt(i))){
            continue;
        }
        sb += s.charAt(i);
     }
     sb = sb.toLowerCase();
        System.out.println(sb);
     int i = 0;
     int j = sb.length()-1;
     while(i < j){
        if(sb.charAt(i) != sb.charAt(j)) return false;
        i++;
        j--;
     }
     return true;
    }

}