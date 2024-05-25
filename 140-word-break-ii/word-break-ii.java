class Solution {
    private static void backtrack(String s, int index, HashMap<String, Integer> map, StringBuilder curr, List<String> res){
        if (index >= s.length()){
            res.add(curr.toString());
            return;
        }
        for (int i = index + 1; i <= s.length(); i++){
            String t = s.substring(index, i);
            if (map.getOrDefault(t, 0) == 1){
                int len = curr.length();
                curr.append(t).append(i < s.length() ? " ":"");
                backtrack(s, i, map, curr, res);
                curr.setLength(len);
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : wordDict) map.put(word, 1);
        backtrack(s, 0, map, new StringBuilder(), res);
        return res;
    }
}