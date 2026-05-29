class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            min = Math.min(min, digitSum(num));
        }
        return min;
    }
    private int digitSum(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
    return sum;
    }
}