class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            int prev = s.charAt(i-1) - '0';
            int forw = s.charAt(i) - '0';
            sum += Math.abs(prev-forw);
        }
        return sum;
    }
}