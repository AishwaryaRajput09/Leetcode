class Solution {
    public int uniquePaths(int m, int n) {
        HashMap<String,Integer> map = new HashMap<>();

        return helper(m,n,map);
        
        
    }
    int helper(int m, int n, HashMap<String,Integer> memo){
        String key = m + "," + n;
        if(memo.containsKey(key)) return memo.get(key);
        if(m == 1 && n == 1) return 1;
        if(m == 0 || n == 0) return 0;
        int res = helper(m-1,n,memo) + helper(m,n-1,memo);
        memo.put(key,res);
        return res;
    }
}