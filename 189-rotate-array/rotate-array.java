class Solution {
    public void rotate(int[] nums, int k) {
        int ind = 0;
        k = k % nums.length;
        if(nums.length < k) return;
        int ans[] = new int[nums.length];
        int pos = nums.length - k;
        for(int i = pos; i < nums.length; i++){
            ans[ind++] = nums[i];
        }
        for(int i = 0; i < pos; i++){
            ans[ind++] = nums[i];
        }
        for(int i = 0; i < ans.length; i++){
            nums[i] = ans[i];
        }
    }
}