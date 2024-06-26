class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int x = 1; x <= n; x++) {
            // Number of elements >= x is n - (index of first element >= x)
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] >= x) {
                    count = n - i;
                    break;
                }
            }
            if (count == x) {
                return x;
            }
        }

        return -1;
    }
}
