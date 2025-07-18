class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        
        if(checkAllnine(digits)){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        for(int i = n ; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
           
        }
        return digits;
    }
    boolean checkAllnine(int[] digits){
        for(int digit: digits){
            if(digit != 9){
                return false;
            }
        }
        return true;
    }
}