class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
         while(i < nums.length){
            int cor = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[cor]){
                swap(nums,i,cor);
            }else{
                i++;
            }
         }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                return j + 1;
            }
        }
        return nums.length + 1;
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}