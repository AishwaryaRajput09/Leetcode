class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums1){
            if(freq.containsKey(num)){
            freq.put(num, freq.get(num) + 1);
            }else{
                freq.put(num, 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int num : nums2){
            if(freq.containsKey(num)){
                min = Math.min(min, num);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}