class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int l = 0;
        int[] result = new int[list.size()];
        for(int n: list){
            result[l++] = n;
        }
        return result;

    }
}