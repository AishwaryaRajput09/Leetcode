class Solution {
    public int removeElement(int[] nums, int val) {
        int low = 0;
        int cnt = 0;
        while(low < nums.length){
            if(nums[low] != val){
                nums[cnt] = nums[low];
                cnt++;
            }
            low++;
        }
        return cnt;
    }
}