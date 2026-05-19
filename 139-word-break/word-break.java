class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        for(String word: wordDict){
            set.add(word);
        }
        // String  op = "";
        Boolean dp[] = new Boolean[s.length()];
        return helper(s, set, 0, dp);
    }

    public boolean helper(String s,  HashSet<String> set, int idx, Boolean dp[]){

        if(idx == s.length()){
            // dp[idx] = true;
            return true;
        }
        if(dp[idx] != null){
            return dp[idx];
        }
        for(int i = idx; i < s.length(); i++){
            String word = s.substring(idx, i+1);
            if(set.contains(word)){
               boolean flag = helper(s, set, i+1, dp);
               if(flag){ 
                dp[idx] = true;
                return true;}
            }
        }
        dp[idx] = false;
        return false;
    }
} 