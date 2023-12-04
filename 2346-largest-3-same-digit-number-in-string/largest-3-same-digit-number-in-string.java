class Solution {
    public String largestGoodInteger(String num) {
        int ans = -1;
        for(int i = 0; i < num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)){
                String sb = num.substring(i,i+3);
                ans = Math.max(ans,Integer.parseInt(sb));
            }
        }
        if(ans == 0){
            return "000";
        }if(ans == -1){
            return "";
        }
        return ""+ans;
    }
}