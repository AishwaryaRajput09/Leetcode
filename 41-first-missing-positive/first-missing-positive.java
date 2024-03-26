class Solution {
    public int firstMissingPositive(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int n: nums){
        if(map.containsKey(n)){
            map.put(n,map.get(n) + 1);
        }else{
            map.put(n,1);
        }
       }
       for(int i = 1; i <= nums.length; i++){
            if(map.containsKey(i)){
                continue;
            }else{
                return i;
            }
       }
       return nums.length+1;
    }
}