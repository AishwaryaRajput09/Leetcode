class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        return hasOc(map);

    }
    public boolean hasOc(HashMap<Integer,Integer> map){
        HashMap<Integer,Integer> occ = new HashMap<>();
        for(Integer value : map.values()){
            Integer count = occ.get(value);
            if(count != null){
                occ.put(value,count+1);
            }else{
                occ.put(value,1);
            }
        }
        for(int c : occ.values()){
            if(c > 1){
                return false;
            }
        }
        return true;
    }
}