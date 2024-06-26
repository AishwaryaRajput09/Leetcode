class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(sb.length() > 0 && Math.abs(sb.charAt(sb.length()-1)-ch)==32){
                    sb.deleteCharAt(sb.length()-1);
                }else{
                    sb.append(ch);
                }
            }
        return sb.toString();
        }
}