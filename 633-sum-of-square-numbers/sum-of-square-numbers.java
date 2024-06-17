class Solution {
    public boolean judgeSquareSum(int c) {
        long i = 0; 
        long j =(long) Math.sqrt(c);
        if( c == 1) return true;
        while(i <= j){
            long sum = 0;
            
                sum = (i * i) + (j * j) ;
                if( sum == c){
                    return true;
                }else if(sum > c){

                j--;
                }else {
                    i++;
                }
            
        }
         return false;
    }
}