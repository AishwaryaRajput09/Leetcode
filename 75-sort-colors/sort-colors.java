class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    swap(nums, i , j);
                }
            }
        }
    }
        private void swap(int[] nums, int i , int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}