class Solution {
    public int findFinalValue(int[] nums, int original) {
       boolean x = true;
       while(x){
        x = find(nums,original);
        original *= 2;
       }
        return original/2;
    }
    public boolean find(int[] nums, int val){
        for(int i : nums){
            if(i == val){
                return true;
            }
        }
        return false;
    }
}