class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int right = 0,left = 0,maxL = 0,max = 0,cost = 0;
        while(right < s.length()){
            if(cost <= maxCost){
            cost += Math.abs(s.charAt(right)-t.charAt(right));
            right++;
            }
            

            while(cost >  maxCost) {
                cost -= Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            maxL = Math.max(maxL,right - left);
        }
        return maxL;
     }
}