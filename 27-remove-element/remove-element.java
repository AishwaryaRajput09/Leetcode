class Solution {
    public int removeElement(int[] nums, int val) {
        // int length = nums.length;
    
        int WriteInd = 0;
            for(int readInd = 0 ; readInd < nums.length; readInd++){
                if(nums[readInd] != val){
                    nums[WriteInd] = nums[readInd];
                    WriteInd++;
                }
            }
            // length = nums.length - 1;
        return WriteInd;
        }
    
}