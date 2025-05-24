class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int Mprofit = 0;
        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }else if(price - minPrice > Mprofit){
                Mprofit = price - minPrice ;
            }
        }
        return Mprofit;
    }
}