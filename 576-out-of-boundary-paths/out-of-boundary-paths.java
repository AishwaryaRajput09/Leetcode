class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int MOD = 1000000007;
        int[][][] dp = new int[m][n][maxMove + 1];
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int k = 1; k <= maxMove; k++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int[] dir : directions) {
                        int ni = i + dir[0];
                        int nj = j + dir[1];
                        if (ni < 0 || ni >= m || nj < 0 || nj >= n) {
                            dp[i][j][k]++;
                        } else {
                            dp[i][j][k] = (dp[i][j][k] + dp[ni][nj][k - 1]) % MOD;
                        }
                    }
                }
            }
        }

        return dp[startRow][startColumn][maxMove];
    }
}
