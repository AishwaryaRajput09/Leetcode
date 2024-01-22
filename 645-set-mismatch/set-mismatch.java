class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] miss = new int[2];
        int i = 0;
        while(i < nums.length){
            int corr = nums[i]-1;
            if(nums[i] != nums[corr]){
                swap(nums,i,corr);
            }else{
                i++;
            }
        }
        for(int j = 0; j < nums.length ; j++){
            if(nums[j] != j+1){
                miss[0] = nums[j];
                miss[1] = j+1;
            }
        }
        return miss;
    }
    private void swap(int[] arr,int i, int corr){
        int temp = arr[i];
        arr[i] = arr[corr];
        arr[corr] = temp;
    }
}