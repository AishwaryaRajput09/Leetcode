class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    boolean solve(char[][] board){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    for(char ch ='1'; ch <= '9'; ch++){
                        if(rowCol(ch,board, i, j) &&  gridWise(ch,board,i,j)){
                            board[i][j] = ch;
                            if(solve(board)){
                                return true;
                            }else{
                                board[i][j] = '.';
                            }
                        }
                    }
                        return false;
                }
            }
        }
        return true;
    }
    boolean rowCol(char ch, char[][] mat, int row, int col){
        //rowwise
        for(int i = 0; i < 9; i++){
            if(i != row && mat[i][col] ==ch){
                return false;
            }
            if(i!= col && mat[row][i] ==ch){
                return false;
            }
        }
        //columnwise
        return true;
    }
    boolean gridWise(char ch, char[][] grid, int row, int col){
        int startR = (row/3)*3;
        int startC = (col/3)*3;
        for(int i = startR; i < startR+3; i++){
            for(int j = startC; j< startC+3; j++){
                if((i != row && j != col )&&  grid[i][j]==ch){
                    return false;
                }
            }
        }
        return true;
    }
}