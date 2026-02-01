class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
              int[] current = nums[0];
        for(int i = 1; i < nums.length; i++){
        if (current[1] >= nums[i][0]) {
            current[1] = Math.max(current[1], nums[i][1]);
        } else {
            result.add(current);
            current = nums[i];
    
       }
    }
         result.add(current);

        return result.toArray(new int[result.size()][]);
        }
                
}