class Solution {
    public int trap(int[] h) {
        int maxL = 0;
        int maxR = 0;
        int i = 0;
        int t = 0;
        int j = h.length - 1;
        while(i <= j){
            if(h[i] <= h[j]){
               if(h[i] > maxL){
                maxL = h[i];
               }else{
                t += maxL-h[i];
               }
               i++;
            }else{
                if(h[j] > maxR){
                    maxR = h[j];
                }else{
                    t += maxR - h[j];
                }
                j--;
            }
        }
        return t;
    }
}