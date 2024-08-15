
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length-1]-nums[0];
        while(left <right){
            int mid = left + (right-left)/2;
            if(countP(nums,mid) < k){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return right;
    }
    private int countP(int[] nums,int mid){
        int cnt = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            while(j < nums.length && nums[j] - nums[i] <= mid){
                j++;
            }
            cnt += (j - i - 1);
        }
        return cnt;
    }
}
