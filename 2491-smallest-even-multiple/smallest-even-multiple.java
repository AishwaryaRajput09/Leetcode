class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i = 1; i <= n; i++){
            if(n % 2 == 0){
                return n;
            }else{
                return n * 2;
            }
        }
        return -1;
    }
}