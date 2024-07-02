class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 0; i < nums1.length; i++){
        //     for(int j = 0; j < nums2.length; j++){
        //         if(nums1[i] == nums2[j]){
        //             list.add(nums1[i]);
        //             nums2[j] = Integer.MIN_VALUE;
        //             break;
        //         }
        //     }
        // }
        // int l = 0;
        // int[] result = new int[list.size()];
        // for(int n: list){
        //     result[l++] = n;
        // }
        // return result;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i= 0;
        int j= 0;
        ArrayList<Integer> res = new ArrayList<>(); 
        while( i < nums1.length && j < nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                res.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = res.stream().mapToInt(k -> k).toArray();
        return result;
    }
}