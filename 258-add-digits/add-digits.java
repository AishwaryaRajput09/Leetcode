class Solution {
    public int addDigits(int num) {
        int sum = 0;
        int n = num;
        while(n > 0 || sum > 9){
            if(n == 0){
                n = sum; 
                sum =0;  
            }
            int rem = n % 10;
            sum += rem;
            n = n / 10;
            System.out.println(n);
            
        }
        return sum;
    }
}