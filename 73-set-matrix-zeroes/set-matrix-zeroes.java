class Solution {
    public void setZeroes(int[][] matrix) {
        

        int m = matrix.length;
        int n = matrix[0].length;

        boolean first_row_zero = false;
        for (int c = 0; c < n; c++) {
            if (matrix[0][c] == 0)
                first_row_zero = true;
        }
        boolean first_col_zero = false;
        for (int r = 0; r < m; r++) {
            if (matrix[r][0] == 0)
                first_col_zero = true;
        }

        // now as we are marking first row and col we we will exclude them while searching for zeros 
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }
        // turn rows to zero which contains zero
        for (int r = 1; r < m; r++) {
            if (matrix[r][0] == 0) {
                for (int c = 1; c < n; c++) {
                    matrix[r][c] = 0;
                }
            }
        }

        //cols turn to zero
        for (int c = 1; c < n; c++) {
            if (matrix[0][c] == 0) {
                for (int r = 1; r < m; r++) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (first_row_zero) {
            for (int c = 0; c < n; c++) {
                matrix[0][c] = 0;
            }
        }
        if (first_col_zero) {
            for (int r = 0; r < m; r++) {
                matrix[r][0] = 0;
            }
        }

    }
}