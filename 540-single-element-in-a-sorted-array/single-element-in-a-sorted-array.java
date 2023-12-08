class Solution {
    public int singleNonDuplicate(int[] nums) {
       int left = 0;
       int right = nums.length-1;
    //    int mid = (right-left)/2;
       while(left<=right){
          int mid =left + ( right-left)/2;
           
           if(mid > 0 && nums[mid] ==nums[mid-1]){
               if((mid-1)%2==0){
                   left = mid + 1;
               }else{
                   right = mid -1;
               }
           }else if(mid < nums.length-1 && nums[mid] == nums[mid+1]){
               if((mid+1)%2==0){
                   right = mid -1;
               }else{
                   left = mid + 1;
               }
           }else{
               return nums[mid];
           }
       }
       return -1;
    }
}