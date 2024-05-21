class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ot = new ArrayList<>();
        int ind = 0;
        solve(nums,list,ot,ind);
        return list;
    }
    private void solve(int[] nums, List<List<Integer>> list, List<Integer> ot, int ind){
        if(ind == nums.length){
            list.add(new ArrayList<>(ot));
            return;
        }
        ot.add(nums[ind]);
        solve(nums,list,ot,ind+1);
        ot.remove(ot.size() - 1);
        solve(nums, list, ot, ind + 1); // Create a new ArrayList ot each time
    }
}