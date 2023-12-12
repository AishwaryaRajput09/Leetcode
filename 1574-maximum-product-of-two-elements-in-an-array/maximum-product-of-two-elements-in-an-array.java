class Solution {
    public int maxProduct(int[] nums) {
        // int max = 0;
        // int secondMax = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] >= max){
        //         secondMax = max;
        //         max = nums[i];
        //     }
        //     else if(nums[i] >= secondMax  ){
        //         secondMax = nums[i];
        //     }
        // }
        // int result = (max-1)*(secondMax-1);
        // return result;
        Arrays.sort(nums);
        return ((nums[nums.length-1]-1) *( nums[nums.length-2]-1));
    }
}