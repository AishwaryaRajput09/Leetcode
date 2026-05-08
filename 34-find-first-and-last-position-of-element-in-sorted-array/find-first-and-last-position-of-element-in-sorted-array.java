class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (right + left)/2;
            if(nums[mid] == target){
                int L = mid;
                while(L > 0 && nums[L-1] == target){
                    L--;
                }
                int R = mid;
                while(R < nums.length - 1 && nums[R+1] == target){
                    R++;
                }
                return new int[]{L, R};
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}