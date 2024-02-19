class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n == 1){
        //     return true;
        // }
        if(Helper(n)){
            return true;
        }
        return false;
    }
    public boolean Helper(int n){
        double res = 0;
        for(double i = 0; i <= 30; i++){
            res = Math.pow(2,i);
            if(res == n){
                return true;
            }
        }
        return false;
    }
}