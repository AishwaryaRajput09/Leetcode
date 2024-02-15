class Solution {
    public long largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        long sum = 0;
        for(int num: nums){
            sum += num;
        }
        for(int i = n - 1; i >= 0; i--){
            if(sum - nums[i] > nums[i]){
                return sum;
            }
            sum -= nums[i];
        }
        return -1;
    }
}