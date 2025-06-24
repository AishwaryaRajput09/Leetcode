class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keys = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key){
                keys.add(i);
            }
        }
        for(int i = 0; i < nums.length; i++){
            boolean mark = false;
            for(int j : keys){
                if(Math.abs(i - j) <= k){
                    mark = true;
                }
            }
            if(mark) res.add(i);
        }
        return res;
    }
}