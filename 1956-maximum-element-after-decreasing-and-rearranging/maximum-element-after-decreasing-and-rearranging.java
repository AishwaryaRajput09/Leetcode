

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);

        arr[0] = 1; // Ensure the first element is 1

        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.min(arr[i], arr[i - 1] + 1); // Ensure the absolute difference is <= 1
        }

        return arr[arr.length - 1]; // Return the maximum element
    }
}
