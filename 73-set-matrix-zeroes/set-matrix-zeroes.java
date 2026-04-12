class Solution {
    public void setZeroes(int[][] matrix) {
        // HashSet<Integer> zero_rows = new HashSet<>();
        // HashSet<Integer> zero_cols = new HashSet<>();
        // for (int r = 0; r < matrix.length; r++) {
        //     for (int c = 0; c < matrix[0].length; c++) {
        //         if (matrix[r][c] == 0) {
        //             zero_rows.add(r);
        //             zero_cols.add(c);
        //         }
        //     }
        // }
        // for (int r = 0; r < matrix.length; r++) {
        //     for (int c = 0; c < matrix[0].length; c++) {
        //         if(zero_rows.contains(r) || zero_cols.contains(c)){
        //             matrix[r][c] = 0;
        //         }
        //     }
        // }

        // If we use hashset it takes extra space of(m+n) row , and col m(represents number of rows that contains 0 and n is for cols that contains 0) to optimize it further what we can do ??  I read that we can actually mark the row and cols which contains 0 without hashSet or extra matrix so how can we achieve that it is simple just make 0th col and 0th row as your marker so whenever any col contains 0 we mark the 0th row and 0th col as 0 but for taking care of that we also need to take care of the first row or col already has 0 if it has then it would be bluder to mark them. so, before marking them for entire matrix we will check if they contains 0 or no with taking boolean flags

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