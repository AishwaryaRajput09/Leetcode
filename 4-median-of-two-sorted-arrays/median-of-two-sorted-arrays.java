class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int [] arr = new int[n + m];
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }
        while(i < m){
            arr[k++] = nums1[i++];
        }
        while(j < n){
            arr[k++] = nums2[j++];
        }

        double res = 0.0;
        int len = arr.length;

        if(len % 2 == 0){
            res = (arr[len / 2 -1]  + arr[len/2])/2.0;
        }else{
            res = arr[len/2];
        }
        return res;
    }
}