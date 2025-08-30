class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean falg = true;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
              if(!columnWise(board[i][j], i, j,board))return false;
              if(!rowWise(board[i][j], i, j,board))return false;
              if(!gridWise(board[i][j], i, j,board))return false;
                }
            }
        }
        return true;
    }
    boolean columnWise(char c, int row, int col, char[][] grid){
        for(int j = 0; j < 9; j++){
            if(j != row && grid[j][col] == c){
                return false;
            }
        }
        return true;
    }
    boolean rowWise(char c, int row, int col, char[][] grid){
        for(int j = 0; j < 9; j++){
            if(j != col && grid[row][j] == c){
                return false;
            }
        }
        return true;
    }
    boolean gridWise(char c, int row, int col, char[][] grid){
        int startR = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for(int i = startR; i < startR+3; i++){
            for(int j = startCol; j < startCol+3; j++){
                if((row != i && col != j) && (grid[i][j] == c)){
                    return false;
                }
            }
        }
        return true;
    }

}