class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, result = 0, oddCount = 0;
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 1;
        for (int num : nums) {
            if (num % 2 != 0) {
                oddCount++;
            }
            if (oddCount >= k) {
                result += prefixSum[oddCount - k];
            }
            prefixSum[oddCount]++;
        }
        
        return result;
    }
}