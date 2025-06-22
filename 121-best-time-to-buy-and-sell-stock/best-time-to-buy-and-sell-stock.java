class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int Mprofit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else if(prices[i] - minPrice > Mprofit){
                Mprofit = Math.max(Mprofit, prices[i] - minPrice);
            }
        }
        return Mprofit;
    }
}