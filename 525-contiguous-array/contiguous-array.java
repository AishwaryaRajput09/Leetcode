class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int cnt = 0;
        int maxL = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                cnt++;
            }else{
                 cnt--;
            }

            if(map.containsKey(cnt)){
                maxL = Math.max(maxL, i - map.get(cnt));
            }else{
                map.put(cnt,i);
            }
        }
        return maxL;
    }
}