class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--; // because we consider the first number as 1
        while (k > 0) {
            int steps = countSteps(curr, n);
            if (steps <= k) {
                curr++; // move to the next prefix
                k -= steps;
            } else {
                curr *= 10; // move down to the next level
                k--;
            }
        }
        return curr;
    }

    // Count steps between 'curr' and 'curr + 1' in lexicographical order
    private int countSteps(int curr, int n) {
        long steps = 0;
        long first = curr;
        long last = curr;
        while (first <= n) {
            steps += Math.min(n + 1, last + 1) - first;
            first *= 10;
            last = last * 10 + 9;
        }
        return (int) steps;
    }
}
