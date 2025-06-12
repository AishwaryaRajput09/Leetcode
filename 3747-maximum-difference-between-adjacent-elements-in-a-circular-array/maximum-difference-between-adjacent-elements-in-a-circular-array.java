class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = Math.abs(nums[0] - nums[nums.length-1]);
        for(int i = 1; i < nums.length; i++){
            maxDiff = Math.max(Math.abs(nums[i-1] - nums[i]),maxDiff);
        }
        return maxDiff;
    }
}