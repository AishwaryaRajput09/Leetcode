class Solution {
    public int removeDuplicates(int[] nums) {
        int check = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[check]){
                nums[check+1] = nums[i];
                check++;
            }
        }
        return check+1;
    }
}