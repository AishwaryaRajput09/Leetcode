class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
            
        }
        int maxfreq = 0;
        for(int freq : map.values()){
            maxfreq = Math.max(maxfreq,freq);
        }
        int count = 0;
        for(int freq: map.values()){
            if(maxfreq == freq){
                count+= freq;
            }
        }
        return count;
    }
}