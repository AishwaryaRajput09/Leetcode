class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        
     
        int m = grid.length;
        int n = grid[0].length;

        int numLayers = Math.min(m,n)/2;

        for(int layer = 0; layer < numLayers; layer++) {
        int top = layer;
        int left = layer;
        int right = n - 1 - layer;
        int bottom = m - 1 - layer;
        ArrayList<Integer> flatten = new ArrayList<>();
        //first row;
            for (int i = left; i < right; i++) {
                flatten.add(grid[top][i]);
            }
            //last col
            for (int i = top; i < bottom; i++) {
                flatten.add(grid[i][right]);
            }
            //last row          
            for (int i = right; i > left; i--) {
                flatten.add(grid[bottom][i]);
            }
            // first col
            for (int i = bottom; i > top; i--) {
                flatten.add(grid[i][left]);
            }
        int size = flatten.size();

        int currK = k % size;
        
        Collections.rotate(flatten, -currK);
        
        // Put it back 
        int ind = 0;
        for (int i = left; i < right; i++) {
               System.out.print(flatten.get(ind) + " ");
               grid[top][i] = flatten.get(ind++);
            }
            //last col
            for (int i = top; i < bottom; i++) {
                System.out.print(flatten.get(ind) + " ");
                grid[i][right] = flatten.get(ind++);
            }
            //last row          
            for (int i = right; i > left; i--) {
                System.out.print(flatten.get(ind));
                grid[bottom][i] = flatten.get(ind++);
            }
            // first col
            for (int i = bottom; i > top; i--) {
                System.out.print(flatten.get(ind));
                grid[i][left] = flatten.get(ind++);
            }
        }
        return grid;
    }
}