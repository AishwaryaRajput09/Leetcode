class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        solve(result,ans,s,0);
        return result;
    }
    private void solve(List<List<String>> result, List<String> ans,String s,int start){
        if(start == s.length()){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int e = start + 1; e <= s.length(); e++){
            String substr = s.substring(start,e);
            if(isPal(substr)){
                ans.add(substr);
                solve(result,ans,s,e);
                ans.remove(ans.size() - 1);
            }
        }
    }
    private boolean isPal(String s){
        int st = 0;
        int e = s.length() - 1;
        while( st < e){
            if(s.charAt(st) != s.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}