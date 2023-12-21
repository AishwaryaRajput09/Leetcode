class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int m = points[0].length;
        int ans[] = new int[n];
        int k = 0;
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j+=2){
                ans[k++] = points[i][j];
            }
        }
        Arrays.sort(ans);
        int dist = Integer.MIN_VALUE;
        for(int i = 1 ; i < n ; i++){
            dist = Math.max(dist,ans[i]-ans[i-1]);
        }
        return dist;
    }
}