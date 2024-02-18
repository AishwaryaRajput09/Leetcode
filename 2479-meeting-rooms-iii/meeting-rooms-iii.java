

class Solution {
    public int mostBooked(int n, int[][] meets) {
        int[] ans = new int[n];
        long[] times = new long[n];
        Arrays.sort(meets, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < meets.length; i++) {
            int start = meets[i][0], end = meets[i][1];
            boolean flag = false;
            int minind = -1;
            long val = Long.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (times[j] < val) {
                    val = times[j];
                    minind = j;
                }
                if (times[j] <= start) {
                    flag = true;
                    ans[j]++;
                    times[j] = end;
                    break;
                }
            }
            if (!flag) {
                ans[minind]++;
                times[minind] += (end - start);
            }
        }

        int maxi = -1, id = -1;
        for (int i = 0; i < n; i++) {
            if (ans[i] > maxi) {
                maxi = ans[i];
                id = i;
            }
        }
        return id;
    }
}

