class Solution {
    public int maxProductDifference(int[] nums) {
        int max =Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int small =Integer.MAX_VALUE;
        int secondSmall =Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] > max){
                secondMax =max;
                max = nums[i];
            }else if(nums[i]> secondMax){
                secondMax = nums[i];
            }

            if(nums[i]<small){
                secondSmall = small;
                small = nums[i];
                
            }else if(nums[i]<secondSmall){
                secondSmall = nums[i];
            }
        }
    return (max * secondMax) - (small*secondSmall);
    }
}