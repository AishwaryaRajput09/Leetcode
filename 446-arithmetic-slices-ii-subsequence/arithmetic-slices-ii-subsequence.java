class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
       int n = nums.length;
        int count = 0;

        // Create a 2D array to store the count of subsequences for each index and difference
        Map<Integer, Integer>[] dp = new Map[n];

        // Iterate through each index and calculate the number of arithmetic subsequences
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                long diff = (long) nums[i] - nums[j];

                if (diff >= Integer.MIN_VALUE && diff <= Integer.MAX_VALUE) {
                    int diffInt = (int) diff;

                    int sum = dp[j].getOrDefault(diffInt, 0);
                    int original = dp[i].getOrDefault(diffInt, 0);

                    dp[i].put(diffInt, original + sum + 1);
                    count += sum;
                }
            }
        }

        return count;
    }
}