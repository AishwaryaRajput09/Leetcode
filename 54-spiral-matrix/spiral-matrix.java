class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix[0].length;
        int n = matrix.length;

        int top = 0;
        int left = 0;
        int right = m - 1;
        int bottom = n - 1;

        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                list.add(matrix[left][i]);
            }
            top++;

            for(int j = top; j <= bottom; j++){
                list.add(matrix[j][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int j = bottom; j >= top; j--){
                    list.add(matrix[j][left]);
            }
            left++;
            }
        }
        return list;
    }
}