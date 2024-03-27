class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    //    List<List<Integer>> list = new ArrayList<>();
    //    int cnt = 0;
    //    for(int i = 0; i < nums.length;i++){
    //     int ans = 1;
    //     List<Integer> res = new ArrayList<>();
    //     for(int j = i ; j < nums.length; j++){
    //         ans *= nums[j];
    //         if(ans < k){
    //             res.add(nums[j]);
    //             cnt++;
    //         }else{
    //             break;
    //         }
    //     }
    //     list.add(res);
    //    } 
    //    return cnt;
    if( k <= 1) return 0;
    int cnt = 0;
    int prdct = 1;
    int left = 0;
    for(int i = 0; i < nums.length; i++){
        prdct *= nums[i];
        while(prdct >= k){
            prdct /= nums[left++];

        }
        cnt += i - left + 1;
    }
    return cnt;
    }
}