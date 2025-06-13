class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums[nums.length - 1] - nums[0];
        int ans = high;
        while(high >= low){
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for(int i = 1; i < nums.length; i++){
                if(nums[i] - nums[i-1] <= mid){
                    cnt++;
                    i++;
                }
            }
            if(cnt >= p){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return ans;
    }
}