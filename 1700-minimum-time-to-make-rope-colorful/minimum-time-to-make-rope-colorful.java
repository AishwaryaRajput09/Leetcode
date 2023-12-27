class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum = 0;
        for(int i = 1; i < colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){

                sum = Sum(neededTime,i,i-1,sum);
            }
        }
        return sum;
    }
    private int Sum(int[]needed,int i, int j,int sum){
        if(needed[i] > needed[j]){
            sum += needed[j];
        }else{
            sum += needed[i];
            int temp = needed[i];
            needed[i] = needed[j];
            needed[j] = temp;
        }
        return sum;
    }
}