class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
           if(map.containsKey(nums[i])){
                continue;
            }else{
                map.put(nums[i],1);
            }
        }
        for(int i = 0; i < nums.length; i++){

        if(map.containsKey(original) || nums[i] == original){
         original *= 2;
         }
        }
        return original;
    }
}