class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                swap(matrix, i , j);
            }
        }
        for(int i = 0; i < n; i++){
            int start = 0;
             int end = n - 1;
             while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
             }
        }

    }
    public void swap(int[][] matrix, int row, int col){
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
    }
}