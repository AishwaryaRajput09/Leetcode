class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < nums.length;i++){
            char digit = nums[i].charAt(i) ;
            if(digit == '1'){
                ans.append('0');
            }else{
                ans.append('1');
            }
        }
        return ans.toString();
    }
}