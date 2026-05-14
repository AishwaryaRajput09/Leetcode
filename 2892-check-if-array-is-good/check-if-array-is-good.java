class Solution {
    public boolean isGood(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num,0)+ 1);
        }
        boolean flag = false;
        if(freq.containsKey(nums.length-1)){
            if(freq.get(nums.length-1) == 2){
                flag = true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        for(int i = 1; i < nums.length - 1; i++){
            if(!freq.containsKey(i)){
                return false;
            }else if(freq.get(i) > 1){
                    return false;
                }else{

                flag = true;
                }
            }
        
        return flag;
    }
}