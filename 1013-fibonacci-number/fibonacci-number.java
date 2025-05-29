class Solution {
    public int fib(int n) { 
        int[] memo = new int[n+1];
        return helper(n,memo);
    }
    int helper(int n, int[] memo){
        if(n == 1) return 1;
        if(n == 0) return 0;
        memo[n] = helper(n-1,memo) + helper(n-2,memo);
        return memo[n];
    }
}