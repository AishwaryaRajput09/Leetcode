class Solution {
    public int minOperations(String s) {
        return Math.min(countOperations(s, '0'), countOperations(s, '1'));
    }

    private int countOperations(String s, char startChar) {
        int count = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != startChar) {
                count++;
            }

            // Flip the start character for the next position
            if(startChar =='0'){
                startChar = '1';
            }else{
                startChar = '0';
            }
        }

        return count;
    }
}
