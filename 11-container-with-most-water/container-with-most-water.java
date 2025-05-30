class Solution {
    public int maxArea(int[] h) {
        int left = 0;
        int right = h.length - 1;
        int maxWater = 0;
        // if(right <= 1) return right * h[right];
        while(left < right){
            maxWater = Math.max(maxWater, (right-left) * Math.min(h[left],h[right]));
             
           if(h[left] < h[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxWater;
    }
}