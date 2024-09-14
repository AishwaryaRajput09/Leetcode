class Solution {
    public int longestSubarray(int[] nums) {
        int maxNum = 0;
        // Step 1: Find the maximum value in the array
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }

        int longest = 0;
        int currentLength = 0;

        // Step 2: Traverse the array to find the longest subarray of the maximum number
        for (int num : nums) {
            if (num == maxNum) {
                currentLength++;
                longest = Math.max(longest, currentLength);
            } else {
                currentLength = 0;
            }
        }

        return longest;
    }
}
