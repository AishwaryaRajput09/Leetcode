class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        target = Math.abs(target);
        int n = nums.length;
        int totalSum = 0;
        for(int num: nums){
            totalSum += num;
        }
        if((totalSum + target) % 2 != 0 || target > totalSum){
            return 0;
        }
        int sum = (target + totalSum) / 2;
        int [][] dp = new int[21][1000+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < 1001; j++){
                if(i == 0){
                    dp[i][j] = 0;
                }
                if(j == 0){
                    dp[i][j] = 1;
                }
            }
        }
        return subsetSum(nums, dp, n, sum);
    }
    private int subsetSum(int[]nums, int[][]dp, int n, int sum){
        for(int i = 1; i< n+1; i++){
            for(int j = 0; j < sum+1; j++){
                if(nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}