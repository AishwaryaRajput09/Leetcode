class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int pivot = randomPartition(nums, start, end);
        quickSort(nums, start, pivot - 1);
        quickSort(nums, pivot + 1, end);

    }

    public int randomPartition(int[] nums, int low, int high) {

        int random = low + (int) (Math.random() * (high - low + 1));

        swap(nums, random, high);

        return partition(nums, low, high);
    }

    public int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);

            }
        }
        swap(nums, i + 1, right);
        return i + 1;

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}