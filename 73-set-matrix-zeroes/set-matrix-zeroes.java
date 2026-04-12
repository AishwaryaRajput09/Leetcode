class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zero_rows = new HashSet<>();
        HashSet<Integer> zero_cols = new HashSet<>();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    zero_rows.add(r);
                    zero_cols.add(c);
                }
            }
        }
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if(zero_rows.contains(r)){
                    matrix[r][c] = 0;
                }
                if(zero_cols.contains(c)){
                    matrix[r][c] = 0;
                }
            }
        }
    }
}