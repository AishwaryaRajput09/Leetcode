
class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean board[][] = new boolean[n][n];
        List<List<String>> res = new ArrayList<>();
        queens(board, 0, res);
        return res;
    }

    void queens(boolean[][] board, int row, List<List<String>> res) {
        if (row == board.length) {
            res.add(display(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                queens(board, row + 1, res);
                board[row][col] = false;
            }
        }
    }

    boolean isSafe(boolean board[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    List<String> display(boolean[][] board) {
        List<String> ans = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean element : row) {
                if (element) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}
