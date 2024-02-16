class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n : arr){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        
        for(int s : map.values()){
            
            list.add(s);
           
        }
        Collections.sort(list);
        int cnt = list.size();
        for(int freq : list){
            if(freq <= k){
                k -= freq;
                cnt--;
            }else{
                break;
            }
        }
        
    return cnt;
    
    }
}