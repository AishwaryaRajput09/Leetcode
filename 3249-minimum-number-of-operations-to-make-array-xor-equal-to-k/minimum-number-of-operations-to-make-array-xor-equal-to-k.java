class Solution {
    public int minOperations(int[] nums, int k) {
       int xorAll = 0;
        for (int num : nums) {
            xorAll ^= num;
        }

        if (xorAll == k) {
            return 0;
        }

        int target = xorAll ^ k;
        int operations = 0;

        while (target != 0) {
            operations += target & 1;
            target >>>= 1;
        }

        return operations;
    }
}