class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n) + 1);
            }else{
                map.put(n,1);
            }
        }
        for(int n : map.keySet()){
            int val = map.get(n);
            if(val >= 2){
                // int ans = map.get(n);
                return n;
            }
        }
        return -1;
    }
}