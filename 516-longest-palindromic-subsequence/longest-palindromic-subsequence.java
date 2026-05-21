class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        // s2 = s2.toString();
        int m = s.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j<= n; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        return helper(s, s2, m, n, dp);
    }
    private int helper(String s, String s2, int m, int n, int[][] dp){
        for(int i = 1; i<= m; i++){
            for(int j = 1; j <= n; j++){
                if(s.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}