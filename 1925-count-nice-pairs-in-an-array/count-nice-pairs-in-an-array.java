class Solution {
    public int countNicePairs(int[] nums) {
        long count = 0;
        int n = nums.length;

        Map<Integer, Integer> revMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int reversed = rev(nums[i]);
            int diff = nums[i] - reversed;

            // Check for the symmetric pair in the map
            if (revMap.containsKey(diff)) {
                count += revMap.get(diff);
            }

            // Update the map with the current difference
            revMap.put(diff, revMap.getOrDefault(diff, 0) + 1);
        }

        return (int) (count % 1_000_000_007);
    }

    // Optimized rev function
    static int rev(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}
