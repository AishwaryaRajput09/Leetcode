class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < 10; i++){
            dfs(i,n, list);
        }
        return list;
    }
    void dfs(int curr, int n, List<Integer> list){
        if(curr > n) return;
        list.add(curr);
        for(int i = 0; i < 10; i++){
            if(curr * 10 + i > n) return;
            dfs(curr * 10 + i, n, list);
        }
    }
}