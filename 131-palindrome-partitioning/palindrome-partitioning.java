import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        palinS(res, ans, s, 0);
        return res;
    }

    void palinS(List<List<String>> res, List<String> ans, String s, int start) {
        if (start == s.length()) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int end = start + 1; end <= s.length();end++){
            String substr = s.substring(start,end);
            if(isPalindrome(substr)){
                ans.add(substr);
                palinS(res,ans,s,end);
                ans.remove(ans.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
