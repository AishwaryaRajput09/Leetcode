class Solution {
    public int findLHS(int[] nums) {
        int cnt = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i] + 1)){
                cnt = Math.max(cnt,map.get(nums[i]) + map.get(nums[i] + 1));
            }
        }
        return cnt;
    }
}