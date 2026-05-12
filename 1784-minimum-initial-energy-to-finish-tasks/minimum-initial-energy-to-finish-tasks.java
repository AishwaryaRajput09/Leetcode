class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        int currEnergy = 0;
        int initialEnergy = 0;
        for(int[] nums: tasks){
            int actual = nums[0];
            int minimum = nums[1];
            if(currEnergy < minimum){
                initialEnergy += (minimum - currEnergy);
                currEnergy = minimum;
            }
        currEnergy -= actual;
        }
       return initialEnergy;
    }
}