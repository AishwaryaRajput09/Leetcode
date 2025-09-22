class Solution {
    public int maxFrequencyElements(int[] nums) {
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            if(!map.containsKey(n)){
            map.put(n,1);
            }else{
                map.put(n, map.get(n)+1);
            }
        }
        int max = 0;
        for(int val : map.values()){
            if(val > max){
                max = val;
            }
        }
         for(int val : map.values()){
            if(val == max){
                cnt+= val;
            }
        }
        return cnt;
    }
}