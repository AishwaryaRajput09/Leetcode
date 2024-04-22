class Solution {
    public int[] sortArray(int[] nums) {
        // int s = 0;
        int e = nums.length - 1;
        mergeS(nums,0,e);
        return nums;
    }
    public void mergeS(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid =(e + s) / 2;
        mergeS(arr, s, mid);
        mergeS(arr, mid+1, e);
        merge(arr, s, e);
    }

    private void merge(int[] arr, int s, int e) {
        int mid = (e + s) / 2;
        int l1 = mid - s + 1;
        int l2 = e - mid;
        int[] left = new int[l1];
        int[] right = new int[l2];
        int k = s;
        for (int i = 0; i < l1; i++) {
            left[i] = arr[k++];
        }
        k = mid + 1;
        for (int i = 0; i < l2; i++) {
            right[i] = arr[k++];
        }

        k = s;
        int ind1 = 0;
        int ind2 = 0;
        while(ind1 < left.length && ind2 < right.length){
            if(left[ind1] < right[ind2]){
                arr[k++] = left[ind1++];
            }else{
                arr[k++] = right[ind2++];
            }

        }
        while(ind1 < left.length){
            arr[k++] = left[ind1++];
        }
        while(ind2 < right.length){
            arr[k++] = right[ind2++];
        }
    }
}