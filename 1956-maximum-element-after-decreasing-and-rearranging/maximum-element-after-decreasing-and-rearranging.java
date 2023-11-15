class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        int[] count = new int[n + 1];

        // Count the occurrences of each element
        for (int num : arr) {
            count[Math.min(num, n)]++;
        }

        // Update the array to satisfy the conditions
        int currentMax = 0;
        for (int i = 1; i <= n; i++) {
            currentMax = Math.min(currentMax + count[i], i);
        }

        return currentMax;
    }
}
