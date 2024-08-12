class KthLargest {

        ArrayList<Integer> list = new ArrayList<>();
        int v = 0;
    public KthLargest(int k, int[] nums) {
        // Arrays.sort(nums);
        v = k;
        for(int i: nums){
            add(i);
        }
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
         if (list.size() < v) {
            return Integer.MIN_VALUE;
         }
        return list.get(list.size()-v);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */