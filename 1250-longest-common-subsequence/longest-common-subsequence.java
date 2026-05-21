class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        // int cnt = 0;
        int memo[][] = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i==0 || j == 0){
                    memo[i][j] = 0;
                }
            }
        }
        return helper(text1, text2, m, n, memo);
    }
    private int helper(String t1, String t2, int m, int n, int[][] memo){
        // if(m == 0 || n == 0){
        //     return 0;
        // }
        // if(memo[m][n] != 0){
        //     return memo[m][n];
        // }
        // if(t1.charAt(m-1) == t2.charAt(n-1)){
        //     memo[m][n] = 1 + helper(t1, t2, m-1, n-1, memo);
        // }else{
        //     memo[m][n] = Math.max(helper(t1, t2, m-1, n,memo), helper(t1, t2, m, n-1, memo));
        // }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(t1.charAt(i-1) == t2.charAt(j-1)){
                    memo[i][j] = 1 + memo[i-1][j-1];
                }else{
                    memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
                }
            }
        }
        return memo[m][n];
    }
}