class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] mat = new boolean[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    mat[i][j] = true;
                }else{
                    mat[i][j] = false;
                }
            }
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == true){
                    convertToZero(matrix, i, j);
                }
            }
        }

    }
   void convertToZero(int[][] mat, int row, int col){
     for(int k = 0; k < mat.length; k++){
        mat[k][col] = 0;
     }
     for(int k = 0; k < mat[0].length;k++){
        mat[row][k] = 0;
     }
   }
}