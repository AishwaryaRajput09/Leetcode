class Solution {
    public int minSwaps(String s) {
        int bal = 0;
        int minBal = 0;
        for(char ch :s.toCharArray()){
            if(ch == '['){
                bal++;
            }else{
                bal--;
            }
        minBal = Math.min(minBal, bal);
        }
    return (-minBal + 1 ) / 2;
    }
}