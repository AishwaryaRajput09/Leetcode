import java.util.Arrays;
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m+1][n+1];
        for(int[]row:memo){
            Arrays.fill(row, -1);
        }
        return helper(m, n, memo);
    }
    int helper(int m, int n, int[][] memo){
        if(m == 1 && n == 1) return 1;
        if(m == 0 || n == 0) return 0;
        if(memo[m][n] != -1) return memo[m][n];
        memo[m][n] = helper(m-1,n, memo) + helper(m,n-1,memo);
        return memo[m][n];
    }
}