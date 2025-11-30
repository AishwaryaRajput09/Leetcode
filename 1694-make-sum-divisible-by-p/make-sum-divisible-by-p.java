class Solution {
    public int minSubarray(int[] nums, int p) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        for (int n : nums) sum += n;
        int must_remove = (int)(sum % p);
        if (must_remove == 0) return 0;

        map.put(0, -1);
        int currPreRem = 0;
        int minL = nums.length;

        for (int i = 0; i < nums.length; i++) {
            currPreRem = (currPreRem + nums[i]) % p;
            int reqRem = (currPreRem - must_remove + p) % p;

            if (map.containsKey(reqRem)) {
                minL = Math.min(minL, i - map.get(reqRem));
            }

            
            map.put(currPreRem, i);
        }

        return minL == nums.length ? -1 : minL;
    }
}
