class Solution {
public:
    int numSpecial(vector<vector<int>>& mat) {
        int count = 0;
        int rows = mat.size();
        int cols = mat[0].size();
        vector<int> rowSum(rows, 0);
        vector<int> colSum(cols, 0);

        // Calculate row and column sums
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }

        // Check for special elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1 && rowSum[i] == 1 && colSum[j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }
};
