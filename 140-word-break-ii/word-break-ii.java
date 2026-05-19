class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        List<String> res = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        helper(s, res, set, curr, 0);
        return res;
    }
    void helper(String s,List<String> res, HashSet<String> set, StringBuilder curr, int ind){
        if(ind == s.length()){
            res.add(curr.toString());
        }
        for(int i = ind + 1; i <= s.length(); i++){
            String substr = s.substring(ind, i);
            if(set.contains(substr)){
            int len = curr.length();
            curr.append(substr).append(i < s.length() ? " ": "");
            helper(s, res, set, curr, i);
            curr.setLength(len);
            }
        }
    }

}