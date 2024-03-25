class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int j = 0;
        while(j < nums.length){
            int cor = nums[j] - 1;
            if(nums[j] != nums[cor]){
                swap(nums,j,cor);
            }else{
                j++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                list.add(nums[i]);
            }
        }
        return list;
    }
    private static void swap(int[] nums, int i , int cor){
        int temp = nums[i];
        nums[i] = nums[cor];
        nums[cor] = temp;
    }
}