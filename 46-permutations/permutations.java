class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length-1;
        permutations(nums,res,ans,0,n);
        return res;
    }
    void permutations(int[] nums,List<List<Integer>> res ,List<Integer> ans,int i, int n){
            if(i==nums.length){
                for(int k = 0; k < nums.length;k++){
                    ans.add(nums[k]);
                }
                res.add(new ArrayList<>(ans));
                ans.clear();
                return;
            }
            // int k = ans.get(i);
            for(int j = i ; j < nums.length;j++){
                swap(j,i,nums);
                permutations(nums,res,ans,i+1,n);
                swap(j,i,nums);

            }
        
         
    }
     void swap(int i, int j , int [] nums){
             int temp = nums[i];
             nums[i] = nums[j];
             nums[j] = temp;
         }
}