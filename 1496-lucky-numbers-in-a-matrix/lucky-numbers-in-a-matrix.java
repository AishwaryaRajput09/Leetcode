class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(checkMaxMin(matrix,i,j)){
                    res.add(matrix[i][j]);
                }
        }
    }
        return res;
 }
    private boolean checkMaxMin(int[][] matrix, int row, int col){
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         for(int i = 0; i < matrix[0].length;i++){
            min = Math.min(min,matrix[row][i]);
         }
         for(int i = 0; i < matrix.length; i++){
            max = Math.max(max,matrix[i][col]);
         }
         if(matrix[row][col] == max && matrix[row][col] == min){
            return true;
         }
         return false;
    }
}