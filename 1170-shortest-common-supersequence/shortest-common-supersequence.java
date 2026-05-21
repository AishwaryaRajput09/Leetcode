class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
            }
        }
        return lcsToScs(str1, str2, m, n, dp);
    }

    private String lcsToScs(String s1, String s2, int m, int n, int[][] dp) {
        // StringBuilder str = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] =  1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]); 
                }
            }
        }
         StringBuilder lcs = new StringBuilder();
        int i = m;
        int j = n;
        while(i > 0 && j > 0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                lcs.append(s1.charAt(i-1));
                i--;
                j--;
            }else{
                if(dp[i-1][j] > dp[i][j-1]){
                    lcs.append(s1.charAt(i-1));
                    i--;
                }else{
                    lcs.append(s2.charAt(j-1));
                    j--;
                }
            }
        }
        while(i > 0){
            lcs.append(s1.charAt(i-1));
            i--;
        }
        while(j > 0){
            lcs.append(s2.charAt(j-1));
            j--;
        }

       return lcs.reverse().toString();
    }
}