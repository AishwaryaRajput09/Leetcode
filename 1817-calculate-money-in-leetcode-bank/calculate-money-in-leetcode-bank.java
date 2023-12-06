class Solution {
    public int totalMoney(int n) {
        int week = n/7;
        int ans = solve(week);
        int day = n % 7;
        if(day == 0){
            return ans;
        }else{
            int currentWeek = week + 1;
            while(day>0){
                ans+=currentWeek;
                currentWeek++;
                day--;
            }
        }
        return ans;

    }
    private int solve(int week){
        int res =  0;
        for(int i = 0; i<week;i++){
            res += 28 + (i*7);
        }
        return res;
    }
}