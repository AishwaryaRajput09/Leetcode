class Solution {
    public boolean checkValidString(String s) {
         int lmin = 0;
         int lmax = 0;

         for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' ){
                lmin++;
                lmax++;
            }else if(ch == ')'){
                lmin--;
                lmax--;
            }else{
                lmin--;
                lmax++;
            }
            if(lmin < 0){
                lmin = 0;
            }
            if(lmax < 0){
                return false;
            }
         }
        if(lmin == 0)
         {return true;}
         return false;
    }
}