class Solution {
    public int numJewelsInStones(String j, String s) {
        int cnt = 0;
        for(int i = 0; i < j.length(); i++){
            int k = 0;
            while(k < s.length()){
                if(j.charAt(i) == s.charAt(k)){
                    cnt++;
                }
                k++;
            }
        }
        return cnt;
    }
}