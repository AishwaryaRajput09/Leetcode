class Solution {
    public boolean isValidSudoku(char[][] board) {
        //first let's intialize hashset to store row and colums we will need 9 hashset each so lets just make arraylist of hashset
        ArrayList<HashSet<Character>> set_of_rows = new ArrayList<>();
        ArrayList<HashSet<Character>> set_of_cols = new ArrayList<>();
        // and next the grid as we have 9 subgrids we will be taking 3 row as 0 the second 3 as 1 and same goes for colums
        HashSet<Character>[][] set_of_grids = new HashSet[3][3];
        for(int i = 0 ; i < 9; i++){
            set_of_rows.add(new HashSet<>());
            set_of_cols.add(new HashSet<>());
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                set_of_grids[i][j] = new HashSet<>();
            }
        }

        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                char ch = board[r][c];
                if(ch == '.'){
                    continue;
                }

                if(set_of_rows.get(r).contains(ch)){
                    return false;
                }

                if(set_of_cols.get(c).contains(ch)){
                    return false;
                }

                if(set_of_grids[r / 3][c / 3].contains(ch)){
                    return false;
                }
                set_of_rows.get(r).add(ch);
                set_of_cols.get(c).add(ch);
                set_of_grids[r / 3][c / 3].add(ch);
            }
        }
        return true;
    }
}