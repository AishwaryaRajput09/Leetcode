class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // iif (nums.length < 2) return false;
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
                sum += nums[i];
                int rem = sum % k;
            if(rem < 0) rem += k;
                int frq;
            if(map.containsKey(rem)){
                frq = map.get(rem) + 1;
                cnt += map.get(rem);
            }else{
                frq = 1;
            }
                map.put(rem,frq);
        }
        return cnt;
    }
}