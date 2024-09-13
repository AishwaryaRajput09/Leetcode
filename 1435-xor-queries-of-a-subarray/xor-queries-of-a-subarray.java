class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int[] prefixX = new int[arr.length];
        prefixX[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixX[i] = prefixX[i-1] ^ arr[i];
        }
      
        
        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            // int ans = 0;
            // for(int j = left; j <= right; j++){
            //     ans = ans ^ arr[j];
            // }
            // result[i] = ans;
            if(left == 0){
                result[i] = prefixX[right];
            }else{
                result[i] = prefixX[right] ^ prefixX[left-1];
            }
        }
        return result;
    }
}