class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> result = new ArrayList<>();
         solve(n, "", result, n, n);
         return result;
    }
    private void solve(int n, String sb,List<String> result, int open , int close){
        int len = n * 2;
        if(open == 0 && close == 0){
            result.add(sb);
            return;
        }
        if(open > 0){
            solve(n, sb+'(', result, open-1, close);
        }
        if(close > open){
            solve(n, sb+')', result, open, close-1);
            
        }
    }
}