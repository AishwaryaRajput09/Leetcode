class Solution {
    public int passThePillow(int n, int time) {
        int cycleL = 2 * (n-1);
        int effectiveTime = time % cycleL;

        if(effectiveTime < n) {
            return effectiveTime + 1;
        }else{
            return 2 * n - effectiveTime - 1;
        }
    }
}