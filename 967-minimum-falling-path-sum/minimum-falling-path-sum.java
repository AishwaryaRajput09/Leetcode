class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        if(m == 1 || n == 1){
            return matrix[0][0];
        }
        int [][] arr = new int[m][n];

        for(int[] r : arr){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length;i++){
            ans = Math.min(ans,minFall(matrix,0,i,arr));
        }
    return ans;
    }
    private int minFall(int[][] matrix,int r,int c,int[][] arr){
        int m = matrix.length;
        int n = matrix[0].length;
        if(arr[r][c] != Integer.MAX_VALUE){
            return arr[r][c];
        }
        if(r ==m-1){
            return arr[r][c] = matrix[r][c];
        }
        int l = Integer.MAX_VALUE, ri = Integer.MAX_VALUE;
        if(c > 0){
            l = minFall(matrix,r+1,c-1,arr);
        }
        int s = minFall(matrix,r+1,c,arr);
        if(c<n-1){
            ri = minFall(matrix,r+1,c+1,arr);
        }
        arr[r][c] = Math.min(l,Math.min(s,ri))+matrix[r][c];
        return arr[r][c];
    }

}