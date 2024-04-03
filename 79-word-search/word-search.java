class Solution {
    public boolean exist(char[][] board, String word) {
         if (board == null || board.length == 0 || board[0].length == 0) return false;
         boolean vis[][] = new boolean [board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                 if(dfs(board,i,j,word,0,vis)){
                    return true;
                 }
            }
        }
        return false;
    }
    private boolean dfs(char b[][],int i,int j,String word,int ind,boolean v[][]){
        if(ind == word.length()){
            return true;
        }
        if(i < 0 || i >= b.length || j < 0 || j >= b[0].length || v[i][j] || b[i][j] != word.charAt(ind) ){
            return false;
        }
        v[i][j] = true;
        boolean found = dfs(b,i+1,j,word,ind+1,v) || dfs(b,i-1,j,word,ind+1,v) || dfs(b,i,j+1,word,ind+1,v) || dfs(b,i,j-1,word,ind+1,v);
        v[i][j] = false;
        return found;
    }
}