class Solution {
    public int findLucky(int[] arr) {
        int max = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i], map.get(arr[i])+ 1);
            }
        }
        for(int k : map.keySet()){
            if(k == map.get(k)){
                max = Math.max(max,k);
            }
        }
        return max;
    }
}