class Solution {
    public int countSubstrings(String s) {
        int cnt = 0;
        for(int i = 0 ; i < s.length(); i++){
            for(int j = i; j < s.length();j++){
                if(helper(i,j,s)){
                    cnt++;
                }
            }
        }
        return cnt;

    }
    public boolean helper(int s, int e, String p){
        
        while(s < e){
            if(p.charAt(s) != p.charAt(e)){
                return false;
            }
            s++;
            e--;
            
        }
        return true;
    }
}