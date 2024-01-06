
class Job {
    int start;
    int end;
    int profit;

    public Job(int start, int end, int profit) {
        this.start = start;
        this.end = end;
        this.profit = profit;
    }
}

public class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        Job[] jobs = new Job[n];

        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        // Sort jobs based on end times
        Arrays.sort(jobs, Comparator.comparingInt(a -> a.end));

        int[] dp = new int[n];
        dp[0] = jobs[0].profit;

        for (int i = 1; i < n; i++) {
            int currentProfit = jobs[i].profit;
            int latestNonOverlapIndex = binarySearch(jobs, i);

            if (latestNonOverlapIndex != -1) {
                currentProfit += dp[latestNonOverlapIndex];
            }

            dp[i] = Math.max(currentProfit, dp[i - 1]);
        }

        return dp[n - 1];
    }

    private int binarySearch(Job[] jobs, int index) {
        int low = 0;
        int high = index - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (jobs[mid].end <= jobs[index].start) {
                if (jobs[mid + 1].end <= jobs[index].start) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
