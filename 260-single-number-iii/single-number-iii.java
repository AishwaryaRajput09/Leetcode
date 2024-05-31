class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] result = new int[2];
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num) + 1);
            }
        }
        int i = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                result[i++] = key;
            }
        }
        return result;
    }
}