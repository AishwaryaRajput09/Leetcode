class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int el = 0;
        if(n % 2 != 0){
            for(int i = - (n/2); i <= n/2; i++){
                arr[el++] = i;
            }
        }else{
            for(int i = - (n/2); i < n/2 + 1; i++){
                if(i == 0){
                    continue;
                }else{

                arr[el++] = i;
                }
            }
        }
        return arr;
    }
}