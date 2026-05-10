class Solution {
    public int[] sortArray(int[] nums) {
        int e = nums.length-1;
        mergeSort(0,e,nums);
        return nums;
    }
    public void mergeSort(int start, int end, int[] nums){
        if(start >= end) return;
        int mid = (start + end)/2;

        mergeSort(start, mid, nums);
        mergeSort(mid+1, end, nums);

        merge(nums, start, end);
    }
    public void merge(int[] nums, int s, int e){

        int mid = (s + e)/2;

        int l1 = mid - s + 1;
        int l2 = e - mid;

        int[] L = new int[l1];
        int[] R = new int[l2];

        int k = s;
        for(int i = 0; i < l1; i++){
            L[i] = nums[k++];
        }

        k = mid + 1;
        for(int i = 0; i < l2; i++){
            // System.out.print( k + " ");
            R[i] = nums[k++];
        }

        k = s;
        int ind1 = 0;
        int ind2 = 0;

        while(ind1 < L.length && ind2 < R.length){
            if(L[ind1] < R[ind2]){
                nums[k++] = L[ind1];
                ind1++;
            }else{
                nums[k++] = R[ind2];
                ind2++;
            }
        }
        while(ind1 < L.length){
            nums[k++] = L[ind1++];
        }
        while(ind2 < R.length){
            nums[k++] = R[ind2++];       
        }
    }
    
}