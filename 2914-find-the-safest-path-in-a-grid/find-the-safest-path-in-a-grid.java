class Solution {
    private final int[] rowDir = {-1, 1, 0, 0};
    private final int[] colDir = {0, 0, -1, 1};

    private boolean isValid(boolean[][] visited, int i, int j) {
        int n = visited.length;
        return i >= 0 && j >= 0 && i < n && j < n && !visited[i][j];
    }

    private boolean isSafe(int[][] distToTheif, int safeDist) {
        int n = distToTheif.length;
        Queue<int[]> q = new LinkedList<>();
        if (distToTheif[0][0] < safeDist) return false;
        q.offer(new int[]{0, 0});
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int currRow = curr[0];
            int currCol = curr[1];
            if (currRow == n - 1 && currCol == n - 1) return true;
            for (int dirIdx = 0; dirIdx < 4; dirIdx++) {
                int newRow = currRow + rowDir[dirIdx];
                int newCol = currCol + colDir[dirIdx];
                if (isValid(visited, newRow, newCol)) {
                    if (distToTheif[newRow][newCol] < safeDist) continue;
                    visited[newRow][newCol] = true;
                    q.offer(new int[]{newRow, newCol});
                }
            }
        }
        return false;
    }

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        int[][] distToTheif = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    visited[i][j] = true;
                    q.offer(new int[]{i, j});
                }
            }
        }
        int len = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] curr = q.poll();
                int currRow = curr[0];
                int currCol = curr[1];
                distToTheif[currRow][currCol] = len;
                for (int dirIdx = 0; dirIdx < 4; dirIdx++) {
                    int newRow = currRow + rowDir[dirIdx];
                    int newCol = currCol + colDir[dirIdx];
                    if (isValid(visited, newRow, newCol)) {
                        visited[newRow][newCol] = true;
                        q.offer(new int[]{newRow, newCol});
                    }
                }
            }
            len++;
        }
        int low = 0, high = len;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isSafe(distToTheif, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}