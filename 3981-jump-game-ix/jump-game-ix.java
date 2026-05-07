class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] maxPrefix = new int[n];
        maxPrefix[0] = nums[0];  
        int[] minSuffix = new int[n];
        minSuffix[n-1] = nums[n-1];
        for(int i = 1; i < n; i++){
            maxPrefix[i] = Math.max(maxPrefix[i-1],nums[i]);
        }
        for(int i = n -2 ; i >= 0; i--){
            minSuffix[i] = Math.min( minSuffix[i+1],nums[i]);
        }

        int start = 0;
        int ans[] = new int[n];
        while(start < n){
            int end = start;
            while(end + 1 < n && maxPrefix[end] > minSuffix[end + 1]){
                end++;
            }
            for(int i = start; i <= end; i++){
                ans[i] = maxPrefix[end];
            }
            start = end + 1;
        }
        return ans;
    }

}