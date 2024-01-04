
public class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        for (int i : map.values()) {
            if(i == 1) return -1;
            
                count += i/3 + (i % 3 + 1)/2;
                


            }
        

        return count;
    }
}
