
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        Job[] jobs = new Job[n];

        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(difficulty[i], profit[i]);
        }
        Arrays.sort(jobs, (a, b) -> a.difficulty - b.difficulty);
        Arrays.sort(worker);

        int res = 0;
        int maxProfit = 0;
        int jobIndex = 0;

        for (int ability : worker) {
            while (jobIndex < n && ability >= jobs[jobIndex].difficulty) {
                maxProfit = Math.max(maxProfit, jobs[jobIndex].profit);
                jobIndex++;
            }
            res += maxProfit;
        }

        return res;
    }

    private class Job {
        int difficulty;
        int profit;

        Job(int difficulty, int profit) {
            this.difficulty = difficulty;
            this.profit = profit;
        }
    }
}
