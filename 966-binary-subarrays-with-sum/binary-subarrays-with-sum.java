class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int num : nums){
            sum += num;
            int compl = sum - goal;
            if(map.containsKey(compl)){
                cnt +=map.get(compl);
            }
            if(!map.containsKey(sum)){
                map.put(sum,0);
            }
            map.put(sum,map.get(sum)+1);
        }
        
        return cnt;
    }
}