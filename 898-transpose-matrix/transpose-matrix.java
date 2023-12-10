class Solution {
    public int[][] transpose(int[][] matrix) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        for(int i = 0 ; i < matrix[0].length ; i++){
                ArrayList<Integer> ans = new ArrayList<>();
            for(int j = 0; j<matrix.length; j++){
                ans.add(matrix[j][i]);
            }
            ls.add(ans);
        }
                int rows = ls.size();
        int columns = ls.get(0).size(); // Assuming all rows have the same size

        int[][] array2D = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array2D[i][j] = ls.get(i).get(j);
            }
        }
    return array2D;
    }
}