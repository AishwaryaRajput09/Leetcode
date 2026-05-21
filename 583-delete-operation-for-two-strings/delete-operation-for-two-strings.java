class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];

        /// fill fill fill (initializationnnnnn)
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        /// find lcs lolllllllllll
        return lcs(word1, word2, m, n, dp);
    }
    private int lcs(String s1,String s2,int m,int n,int[][] dp){
        for(int i = 1; i<= m; i++){
            for(int j = 1; j <= n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return m - dp[m][n] + n - dp[m][n];
    }
}