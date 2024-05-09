class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
       Arrays.sort(happiness);
         for (int i = 0; i < happiness.length / 2; i++) {
            int temp = happiness[i];
            happiness[i] =happiness[happiness.length - 1 - i];
            happiness[happiness.length - 1 - i] = temp;
        }

       long ans = 0;
        int c = 0;
        for(int i = 0; i < happiness.length; i++){
            ans += Math.max(0, happiness[i]-c);
            c++;
            if(c >= k){
                break;
            }
        }
        return ans; }
}