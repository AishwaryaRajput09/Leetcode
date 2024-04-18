class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    p += dfs(i,j,grid);
                }
            }
        }
        return p;
    }
    private int dfs(int r, int c, int[][]grid){
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c]== 0){
            return 1;
        }
        if(grid[r][c] == -1){
            return 0;
        }
        grid[r][c] = -1;
        return (dfs(r + 1, c, grid) +
                dfs(r - 1, c, grid) +
                dfs(r, c + 1, grid) +
                dfs(r, c - 1, grid));
    }
}