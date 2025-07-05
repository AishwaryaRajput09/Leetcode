class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        String result = "";
        int preSum = 0;
         StringBuilder sb = new StringBuilder(s);
        for(int i = n - 1; i >= 0; i--){
            preSum += shifts[i] % 26;
                sb.setCharAt(i, (char)((sb.charAt(i) - 'a' + preSum % 26) % 26 + 'a'));

            
        }
        return sb.toString();
    }
}