class Solution {
    int[] parent = new int[26]; 
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        for(int i = 0; i < 26; i++){
            parent[i] = i;
        }

        for(int i = 0; i < s1.length(); i++){
            union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }
        StringBuilder res = new StringBuilder();
        for(char ch: baseStr.toCharArray()){
            char small = (char)(find(ch - 'a') + 'a');
            res.append(small);
        }
        return res.toString();
    }
    int find(int x){
        if(parent[x] != x)
          parent[x] = find(parent[x]);
        return parent[x];
    }
    void union(int x, int y){
        int px = find(x);
        int py = find(y);
        if(py == px){
          return;
             }
             if(px < py){
                parent[py] = px;
             }else{
                parent[px] = py;
             }
    }

}