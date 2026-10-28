class Solution {
    public int majorityElement(int[] nums) {
        int major = nums.length / 2;
        // int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
        if(map.containsKey(num)){
            map.put(num, map.get(num) + 1);
        }else{
            map.put(num,1);
        }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > major){
                return entry.getKey();
            }
        }
        return -1;
    }
}