class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt = 0;
        int i = 0;
    while(i < nums.length){
            if(nums[i] != val){
                nums[cnt] = nums[i];
                cnt++;
            }
                i++;
        }
        return cnt;
    }
}