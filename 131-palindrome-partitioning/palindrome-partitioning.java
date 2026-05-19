class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> pals = new ArrayList<>();
        findPal(s, res, pals, 0);
        return res;
    }
    private void findPal(String s, List<List<String>> res, List<String> pals, int idx){
        if(idx == s.length()){
            res.add(new ArrayList(pals));
            return;
        }
        for(int i = idx + 1; i <= s.length(); i++){
            String substr = s.substring(idx, i);
            if(isPal(substr)){
                pals.add(substr);
                findPal(s, res, pals, i);
                pals.remove(pals.size()-1);
            }

        }
    }
    boolean isPal(String s){
        int i = 0;
        int j = s.length()-1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}