class Solution {
    public int[] sortArray(int[] nums) {
        int e = nums.length - 1;
        mergeSort(0, e, nums);
        return nums;
    }

    public void mergeSort(int start, int end, int[] nums) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;

        mergeSort(start, mid, nums);
        mergeSort(mid + 1, end, nums);

        merge(nums, start, end);
    }

    public void merge(int[] nums, int s, int e) {

        int mid = (e + s) / 2;
        int l1 = mid - s + 1;
        int l2 = e - mid;
        int left[] = new int[l1];
        int right[] = new int[l2];

        int k = s;
        for (int i = 0; i < l1; i++) {
            left[i] = nums[k++];
        }
        k = mid + 1;
        for (int i = 0; i < l2; i++) {
            right[i] = nums[k++];
        }

        k = s;
        int idx1 = 0;
        int idx2 = 0;

        while (idx1 < left.length && idx2 < right.length) {
            if (left[idx1] < right[idx2]) {
                nums[k++] = left[idx1++];
            } else {
                nums[k++] = right[idx2++];
            }

        }
        while (idx1 < left.length) {
            nums[k++] = left[idx1++];
        }
        while (idx2 < right.length) {
            nums[k++] = right[idx2++];
        }

    }

}