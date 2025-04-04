class Solution {
    public int[] minCosts(int[] cost) {
        int minM = Integer.MAX_VALUE;
        int i = 0;
        while(i < cost.length){
            if(cost[i] < minM){
                minM = cost[i];
            }else if(cost[i] > minM){
                cost[i]= minM;
            }
        i++;
        }
        return cost;
    }
}