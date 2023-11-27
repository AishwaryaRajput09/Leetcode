class Solution {
    
    private void perm(int[] nums,List<List<Integer>> res,int ind){
        if(ind == nums.length){
            List<Integer> ans = new ArrayList<>();
            for(int e : nums){
                ans.add(e);
            }
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i = ind; i<nums.length;i++){
            int temp = nums[i];
            nums[i] = nums[ind];
            nums[ind]=temp;
            perm(nums,res,ind+1);
            temp = nums[i];
            nums[i] = nums[ind];
            nums[ind]=temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    perm(nums,res,0);
    return res;
    }
}