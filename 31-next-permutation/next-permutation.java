class Solution {
    public void nextPermutation(int[] nums) {
        // first find the pivot in the array , pivot is that element where all the element after that are in decreasing order..if there is no pivot means all the number are arranged in it last sequence so next sequece will the first sequnce means the smallest lexicographical number so we will just swap the entire array and I will get the result 

        //Step 1 : find the pivot, for finding the pivot we will start traversing from the right until we get the number where pivot is actually bigger than its next number so we will start travesing from the last second element of the array and keep traversing until we get the pivot or it reache to 0.
        int pivot = nums.length - 2;
        while(pivot >= 0 && nums[pivot+1] <= nums[pivot] ){
            pivot--;
        }
        /// so if there is no pivot element available we will reverse the array as discussed
        if(pivot == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        //in case pivot is present then what we will do is we will find the bigger element that pivot from the right side as it will cause slightest increase in the permutation that we want for that purpose we will take one pointer that will find the first large number to pivot from the right'
        int right = nums.length - 1;
        while(right > pivot && nums[right] <= nums[pivot]){
            right--;
        }
        //now we will swap the pivot number with a number greater than pivot
        int temp = nums[pivot];
        nums[pivot] = nums[right];
        nums[right] = temp;

        //ANd at last we will reverse the remaining sequence because again it would be strictly increasing so as discussed in the beggining we can directly reverse it  from pivot + 1 to the end
        reverse(nums, pivot + 1, nums.length - 1);
        // return nums;
        
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
        }

    }
}