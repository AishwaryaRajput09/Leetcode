class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
       int length = jobDifficulty.length;

        // Check if it's impossible to complete all jobs within the provided days
        if (d > length) {
            return -1;
        }

        // Initialize 2D array to store minimum difficulties
        int[][] minDifficulties = new int[d][length];

        // Initialize the first day based on the maximum difficulty encountered so far
        minDifficulties[0][0] = jobDifficulty[0];
        for (int i = 1; i < length; i++) {
            minDifficulties[0][i] = Math.max(minDifficulties[0][i - 1], jobDifficulty[i]);
        }

        // Calculate minimum difficulties for the remaining days and jobs
        for (int day = 1; day < d; day++) {
            for (int job = day; job < length; job++) {
                int maxDiff = jobDifficulty[job];
                minDifficulties[day][job] = Integer.MAX_VALUE;

                // Iterate backward to find the optimal solution
                for (int prevJob = job; prevJob >= day; prevJob--) {
                    maxDiff = Math.max(maxDiff, jobDifficulty[prevJob]);
                    minDifficulties[day][job] = Math.min(minDifficulties[day][job],
                            minDifficulties[day - 1][prevJob - 1] + maxDiff);
                }
            }
        }

        return minDifficulties[d - 1][length - 1];
    }
}