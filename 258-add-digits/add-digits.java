class Solution {
    public int addDigits(int num) {
        int sum = num;
        if(num < 10){
            return num;
        }
        while(sum > 9){
            int newAns = 0;
            while(sum != 0){
                int rem = sum % 10;
                newAns += rem;
                sum = sum /10;
            }
            if(newAns < 9){
                return newAns;
            }
            sum = newAns;
        }
       return sum;
    }
}