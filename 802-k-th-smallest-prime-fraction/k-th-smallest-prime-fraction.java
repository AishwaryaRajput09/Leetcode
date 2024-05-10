class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingDouble((int[]a) -> (double) arr[a[0]]/arr[a[1]]));
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                minHeap.offer(new int[]{i, j});
            }
        }
        while(k > 1){
            minHeap.poll();
            k--;
        }
        int[] result = minHeap.poll();
        return new int[]{arr[result[0]],arr[result[1]]};
    }
}
