class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        int size = map.size();
        int[] res = new int[k];
     
            for(int i = 0; i < k; i++){
                res[i] = list.get(i).getKey();
            }
                
        
        return res;
    }
}