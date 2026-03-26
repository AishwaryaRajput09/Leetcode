class Solution {
    public int reverse(int x) {
       int max = Integer.MAX_VALUE;
       int min = Integer.MIN_VALUE;
       int result = 0;
       while(x != 0){
        if(result > max/10 || result < min/10){
            return 0;
        }
        int rem = x % 10;
        result = result * 10 + rem;
        x = x/10;
       } 
       return result;
    }
}