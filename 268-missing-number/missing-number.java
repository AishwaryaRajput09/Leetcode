class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums[i],i,nums);
            }else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(j != nums[j]){
                return j;
            }
        }
        return nums.length;
    }  
    static void swap(int i , int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}