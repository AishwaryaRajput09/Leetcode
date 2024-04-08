class Solution {
    public int countStudents(int[] st, int[] san) {
        int zcnt = 0;
        int ocnt = 0;
        for(int s : st){
            if(s == 0){
                zcnt++;
            }else{
                ocnt++;
            }
        }
        for(int sa: san){
            if(sa == 0 && zcnt == 0){
                return ocnt;
            }
            if(sa == 1 && ocnt == 0){
                return zcnt;
            }
            if(sa == 0){
                zcnt--;
            }
            if(sa == 1){
                ocnt--;
            }
            
        }
        return 0;
    }
}