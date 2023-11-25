class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int k = 0;
        int ans[] = new int [n];
        int x = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        for(int i = 0 ; i<n;i++){
            sum -= nums[i];
            ans[i]= (nums[i]*i)+x-nums[i]*(n-1-i)+sum;
            x -=nums[i];
        }
        return ans;
    }
}