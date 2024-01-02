class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        
        // Count occurrences of each element in the array
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            maxCount = Math.max(maxCount, countMap.get(num));
        }

        // Create subarrays and populate them with distinct elements
        for (int i = 0; i < maxCount; i++) {
            result.add(new ArrayList<>());
        }

        // Populate subarrays with distinct elements based on their occurrences
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            for (int i = 0; i < Math.min(count, maxCount); i++) {
                result.get(i).add(num);
            }
        }

        return result;
    }
}