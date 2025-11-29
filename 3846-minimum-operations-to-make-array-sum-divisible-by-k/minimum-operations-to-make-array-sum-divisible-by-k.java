class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(sum % k == 0) return 0;
        int extra = 0;
        if(sum > k){
            extra = sum % k;
        }else if(sum < k){
            return sum;
        }
        return extra;
    }
}