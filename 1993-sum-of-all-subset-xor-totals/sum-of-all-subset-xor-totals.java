class Solution {
    public int subsetXORSum(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        subset(nums,nums.length,0,result,ans);
        int Tsum = 0;
       for(ArrayList<Integer> set : result){
        int sum = 0;
        for(int n : set){
            sum ^= n;
        }
        Tsum += sum;
       }
        return Tsum;
    }
    private void subset(int[] nums, int n, int ind,ArrayList<ArrayList<Integer>> result,ArrayList<Integer> ans){
        if(ind == n){
            result.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[ind]);
        subset(nums, n, ind + 1, result, ans);
        ans.remove(ans.size()-1);
        subset(nums, n, ind + 1, result, ans);

    }
}