class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        helper(nums, output, result, 0);
        return result;
    }

    public static void helper(int[] nums, List<Integer> output, List<List<Integer>> result, int ind) {
        if(ind == nums.length){
            result.add(new ArrayList<>(output));
            return;
        }
        // include
       
        output.add(nums[ind]);
        helper(nums, output, result, ind+1);
         // exclude
        output.remove(output.size()-1);
        helper(nums, output, result, ind+1);
    }
}