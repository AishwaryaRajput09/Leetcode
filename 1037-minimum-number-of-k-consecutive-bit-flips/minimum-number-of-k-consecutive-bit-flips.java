class Solution {
    public int minKBitFlips(int[] nums, int k) {
        boolean[] flipped = new boolean[nums.length];
        int validFlips = 0;
        int flipCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i >= k && flipped[i - k]) {
                validFlips--;
            }

            if (validFlips % 2 == nums[i]) {
                if (i + k > nums.length) {
                    return -1;
                }
                validFlips++;
                flipped[i] = true;
                flipCount++;
            }
        }

        return flipCount;
    }
}