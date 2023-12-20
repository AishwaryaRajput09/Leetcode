class Solution {
    public int buyChoco(int[] prices, int money) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int i = 0 ; i < prices.length;i++){
            if(prices[i] < small){
                secondSmall = small;
                small = prices[i];
            }else if(prices[i] < secondSmall){
                secondSmall = prices[i];
            }
        }
       int total = small + secondSmall;
        if(total <= money){
            money = money - total;
        }
        return money;
    }
}