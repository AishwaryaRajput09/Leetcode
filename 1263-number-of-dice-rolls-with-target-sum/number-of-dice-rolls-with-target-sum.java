class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int MOD = 1000000007;
        
        // dp[i][j] represents the number of ways to get the sum j using the first i dice.
        int[][] dp = new int[n + 1][target + 1];
        
        // Base case: there is one way to get a sum of 0 (using 0 dice).
        dp[0][0] = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                // dp[i][j] is the sum of all possible outcomes for the current die (1 to k).
                for (int num = 1; num <= k; num++) {
                    if (j - num >= 0) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - num]) % MOD;
                    }
                }
            }
        }
        
        return dp[n][target];
    }
    
}
