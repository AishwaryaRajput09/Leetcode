class Solution {
    public int candy(int[] r) {
        int n = r.length;
        int cnt = 0;
        int[] res = new int[n];
        Arrays.fill(res,1);
        for(int i = 1; i < n; i++){
            if(r[i] > r[i - 1]){
                res[i] = res[i-1] + 1;
            }
        }
        for(int i = n - 2; i >= 0; i--){
            if(r[i] > r[i + 1]){
                res[i] = Math.max(res[i], res[i+1]+ 1);
            }
        }
        for(int c : res){
            cnt += c;
        }
        return cnt;
    }
}