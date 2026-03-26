class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(i < nums.length && j < nums.length){
            if(nums[i] != 0){
                swap(i, j, nums);
                i++; j++;
            }else{
                i++;
            }
        }
    }
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}