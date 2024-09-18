class Solution {
    public String largestNumber(int[] nums) {
        // Convert the array of integers to an array of strings
        String[] strNums = Arrays.stream(nums)
                                 .mapToObj(String::valueOf)
                                 .toArray(String[]::new);
        
        // Sort the array using a custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare combined strings (a + b) and (b + a)
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Sort in descending order
            }
        });
        
        // Edge case: If the largest number is "0", we return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }
        
        // Join the sorted array into a single string
        return String.join("", strNums);
    }
}
