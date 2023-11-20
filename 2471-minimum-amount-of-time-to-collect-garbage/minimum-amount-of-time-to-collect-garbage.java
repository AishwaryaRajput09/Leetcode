class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int time = 0;
        int n = garbage.length;
        int G_indx = 0;
        int P_indx = 0;
        int M_indx = 0;

        int[] prefixSum=new int[travel.length];
        prefixSum[0] = travel[0];
        for(int i=1; i<travel.length; i++) {
            prefixSum[i] = travel[i] + prefixSum[i-1];
        }

         
        for(int i=0; i<n; i++) {
            String temp = garbage[i];
            time += temp.length();
            for(int j=0; j<temp.length(); j++) {
                if(temp.charAt(j) == 'M') {
                    M_indx = i;
                }
                else if(temp.charAt(j) == 'P') {
                    P_indx = i;
                }
                else if(temp.charAt(j)== 'G'){
                    G_indx = i;
                }
            }
        }

         if (M_indx > 0) {
        time += prefixSum[M_indx-1];
        }
        if (P_indx > 0) {
            time += prefixSum[P_indx-1];
        }
        if (G_indx > 0) {
            time += prefixSum[G_indx-1];
        }
        return time;
    
    }
}