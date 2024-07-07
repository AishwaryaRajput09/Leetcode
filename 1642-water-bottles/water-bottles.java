class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         int sum = numBottles;
         int emptyBottle = numBottles;
        while(emptyBottle >= numExchange){
                int newBottles = emptyBottle / numExchange;
                sum += newBottles;
                emptyBottle = emptyBottle % numExchange + newBottles;
         }
         return sum;
    }
}