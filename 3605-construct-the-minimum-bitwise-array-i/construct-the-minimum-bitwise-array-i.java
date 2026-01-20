class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int [] ans = new int[n];
        int k = 0;
        for(int i = 0; i < n ; i++){
            for(int j = 1; j <= nums.get(i); j++){
                if((j | ( j + 1 ))== nums.get(i)){
                    ans[k] = j;
                    break;
                    }else{
                        ans[k] = -1;
                    }
                
            }
            k++;
        }
        return ans;
    }
}