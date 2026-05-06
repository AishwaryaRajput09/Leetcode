class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char rotatedBox[][] = new char[n][m];
        for(int i = m - 1; i >= 0; i--){
           for(int j = 0; j < n; j++){
                rotatedBox[j][m - 1 - i] = boxGrid[i][j]; 
                System.out.print(rotatedBox[j][m - 1 - i] + " ");
           }
           System.out.println();
        }
        for(int i = 0; i < m; i++){
            sortCol(rotatedBox, i, n);
        }
        return rotatedBox;
     }
     public void sortCol(char[][] rotatedBox, int col, int len){
          int lowestEmptySpace = len - 1;
          int j = len - 1;
          while( j >= 0){
            if(rotatedBox[j][col] == '*'){
                lowestEmptySpace = j - 1;
            }else if(rotatedBox[j][col] == '#'){
                while(lowestEmptySpace > j &&  rotatedBox[lowestEmptySpace][col] != '.'){
                    lowestEmptySpace--;
                }
                if(lowestEmptySpace > j){
                    rotatedBox[j][col] = '.';
                    rotatedBox[lowestEmptySpace][col] = '#';
                    lowestEmptySpace--;
                }
            }
            j--;
          }
     }
}