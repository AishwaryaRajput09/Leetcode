class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++){
             if(grid[i][0] == 0){
              flipRow(grid,i);
            }
        }
        for(int j = 0; j < m; j++){
            int cntz = 0;
            for(int i = 0; i < n; i++){
             if(grid[i][j] == 0){
                cntz++;
            }
            }
            if(cntz > (n - cntz)){
                flipCol(grid,j);
            }
        }
            int sum = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m ; j++){
                    if(grid[i][j]==1){
                        sum += (1 << (m-j-1));
                    }
                }
            }
            return sum;
    }
    private  void flipRow(int[][] grid,int row){
        for(int i = 0; i < grid[0].length; i++){
            grid[row][i] ^= 1;
        }
    }
    private void flipCol(int[][] grid, int col){
        for(int i = 0; i < grid.length;i++){
            grid[i][col] ^= 1;
        }
    }
    
}