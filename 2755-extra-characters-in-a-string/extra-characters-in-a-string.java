class Solution {
    public int minExtraChar(String s, String[] dict) {
 Set<String> set = new HashSet<>();
        for (String w : dict) set.add(w);
        
        int n = s.length();
        int[] dp = new int[n + 1];
        
        for (int i = 0; i <= n; i++) dp[i] = i;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 0; j < i; j++) {
                if (set.contains(s.substring(j, i))) {
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
        }
        
        return dp[n];
    }
}