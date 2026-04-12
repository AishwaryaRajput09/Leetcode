class Solution {
    public int longestConsecutive(int[] nums) {
        //time taken n(logn) + n^2 = n^2
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxCnt = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
        // int j = i;
                if(nums[i+1] - nums[i] == 0){
                    // i++;
                    continue;
                }else if(nums[i+1] - nums[i] > 1){
                    cnt = 0;
                    continue;
                }else{
                    cnt++;
                }
               
            maxCnt = Math.max(maxCnt, cnt);
        }
        return maxCnt+1;
    }
}