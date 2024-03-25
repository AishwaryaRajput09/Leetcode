class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n: nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        for(int n : map.keySet()){
            int val = map.get(n);
            if(val >= 2){
                list.add(n);
            }
        }
        return list;
    }
}