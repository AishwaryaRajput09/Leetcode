class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        int totalSum = 0;
        for(int num: coins){
            totalSum += num;
        }
        // if(totalSum < amount && n == 1) return -1;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= amount; j++){
                if(i == 0 ){
                    dp[i][j] = 0;
                }
             
                if(j ==0){
                    dp[i][j] = 1;
                }
                
            }
        }
        return helper(coins, dp, n, amount);
    }
    private int helper(int[]coins, int[][]dp, int n, int amount){
        for(int i = 1; i < n+1; i++){
            for(int j = 0; j < amount+1; j++){
                if(coins[i-1] <= j){
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }

        }
        return dp[n][amount];
    }
}   
 