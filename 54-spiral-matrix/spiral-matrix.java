class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
            int m = matrix[0].length;
            int n = matrix.length;

            int top = 0;
            int left = 0;
            int bottom = n - 1;
            int right = m - 1;

            while(left <= right && top <= bottom){
                for(int i = left; i <= right; i++){
                    spiral.add(matrix[left][i]);
                }
                top++;
                for(int j = top; j <= bottom; j++){
                    spiral.add(matrix[j][right]);
                }
                right--;
                if(top <= bottom){
                    for(int k = right; k >= left; k--){
                        spiral.add(matrix[bottom][k]);
                    }
                bottom--;
                }
                if(left <= right){
                    for(int l = bottom; l >= top; l--){
                        spiral.add(matrix[l][left]);
                    }
                left++;
                }

            }
            return spiral;
        }
}