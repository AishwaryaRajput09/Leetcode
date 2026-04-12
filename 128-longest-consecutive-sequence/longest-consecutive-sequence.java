class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longestChain = 0;
        // int max_longest_chain = 0;
        for (int num : numSet) {

            if (!numSet.contains(num - 1)) {
                int currNum = num;
                int currChain = 0;
                while(numSet.contains(currNum + 1)){
                    currChain++;
                    currNum++;
                }
                longestChain = Math.max(longestChain, currChain);
            }
        }
        return longestChain+1;
    }
}