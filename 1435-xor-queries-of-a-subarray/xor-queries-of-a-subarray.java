class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int k = 0;
        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int ans = 0;
            for(int j = left; j <= right; j++){
                ans = ans ^ arr[j];
            }
            result[k++] = ans;
        }
        return result;
    }
}