class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean visited[] = new boolean[arr.length];
        Arrays.fill(visited, false);
        return solve(arr, start, visited);
    }

    public boolean solve(int[] arr, int start, boolean[] visited) {
       if(arr[start] == 0){
        return true;
       }
       boolean left = false;
       boolean right = false;
       if(!visited[start]){
        visited[start] = true;
        if(start + arr[start] < arr.length){
        left = solve(arr, start + arr[start], visited);
       }
       if (start - arr[start] >= 0 && start - arr[start] < arr.length){
        right = solve(arr, start - arr[start], visited);
       }
    }
        return left || right ? true: false;
    }
}