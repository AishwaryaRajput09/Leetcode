class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        // int sum = n;
        int ind = 0;
        for(int i = 1; i < n; i++){
            int temp = i;
            if(nonZ(temp) && nonZ(n - i)){
                arr[0] = n - i;
                arr[1] = i;
            }
        }
        return arr;
    }
    boolean nonZ(int temp){
        while(temp != 0){
                if(temp % 10 == 0){
                    return false;
                    // break;
                }
                temp /= 10;
            }
            return true;
    }
}