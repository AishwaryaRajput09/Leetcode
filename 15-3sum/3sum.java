class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // a + b + c = 0   0 -> a + b = -c
        HashSet<List<Integer>> triplets = new HashSet<>();
        int n = nums.length - 1;
        Arrays.sort(nums);
        for (int i = 0; i <= n; i++) {
            if (nums[i] > 0)
                break;

            List<List<Integer>> pairs = two_sorted_sum(nums, i + 1, n, -nums[i]);
            for (List<Integer> pair : pairs) {
                List<Integer> triplet = new ArrayList<>();
                triplet.add(nums[i]);
                triplet.addAll(pair);
                Collections.sort(triplet);
                triplets.add(triplet);
            }

        }
        return new ArrayList<>(triplets);
    }

    public List<List<Integer>> two_sorted_sum(int[] nums, int start, int end, int target){
        List<List<Integer>> pairs = new ArrayList<>();
        while(start < end){
            List<Integer> pair = new ArrayList<>();
            int sum = nums[start] + nums[end];
            if(sum == target){
                pair.add(nums[start]);
                pair.add(nums[end]);
                // pair.add(target);
                pairs.add(pair);
                start++;
               
                // return pairs;
            }else if(sum < target){
                start++;
            }else{
                end--;
            }
        }
    return pairs;
       }
}