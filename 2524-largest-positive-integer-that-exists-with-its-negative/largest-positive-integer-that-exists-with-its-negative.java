public class Solution {
        public int findMaxK(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            int maxpos = -1;
            for(int i : nums){
                set.add(i);
            }
            for(int n: nums){
                if(n > 0 && set.contains(-n)){
                    maxpos = Math.max(maxpos,n);
                }
            }
            return maxpos;
        }
    }
