import java.util.Arrays;

public class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 1;
        int left = 0;
        long sum = 0;

        for (int right = 1; right < nums.length; right++) {
            sum += (long) (nums[right] - nums[right - 1]) * (right - left);

            while (sum > k) {
                sum -= nums[right] - nums[left];
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
