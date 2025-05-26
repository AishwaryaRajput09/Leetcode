class Solution {
    public int[] plusOne(int[] digits) {
        // int res = 0;
        int n = digits.length - 1;
        int[] result = new int[digits.length];
        int carry = 0;
        int last = result.length - 1;
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
        return result;
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