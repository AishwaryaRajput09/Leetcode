class Solution {
    public int maxSatisfied(int[] c, int[] g, int m) {
        int s = 0, a = 0, w = 0;
        for (int i = 0; i < g.length; i++) {
            if (g[i] == 0) s += c[i];
        }
        for (int i = 0; i < g.length; i++) {
            if (g[i] == 1) {
                w += c[i];
            }
            if (i >= m) {
                if (g[i - m] == 1) w -= c[i - m];
            }
            a = Math.max(a, w);
        }
        return s + a;
    }
}
