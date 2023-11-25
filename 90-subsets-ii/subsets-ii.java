public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates
        subsetsHelper(nums, n, ans, currentSubset, 0);
        return ans;
    }

    static List<List<Integer>> subsetsHelper(int[] nums, int n, List<List<Integer>> ans, List<Integer> currentSubset, int ind) {
        if (ind == n) {
            ans.add(new ArrayList<>(currentSubset));
            return ans;
        }

        // Include the current element in the subset
        currentSubset.add(nums[ind]);
        subsetsHelper(nums, n, ans, currentSubset, ind + 1);

        // Skip duplicates
        while (ind < n - 1 && nums[ind] == nums[ind + 1]) {
            ind++;
        }

        // Exclude the current element from the subset
        currentSubset.remove(currentSubset.size() - 1);
        subsetsHelper(nums, n, ans, currentSubset, ind + 1);

        return ans;
    }
}

