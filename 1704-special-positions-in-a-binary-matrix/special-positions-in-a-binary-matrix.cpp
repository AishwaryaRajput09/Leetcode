class Solution {
public:
    int numSpecial(vector<vector<int>>& mat) {
        int count = 0;
        for(int i = 0 ; i<mat.size();i++){
            for(int j = 0 ; j < mat[0].size();j++){
                if(mat[i][j]==1 && isSpecial(mat,i,j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    bool isSpecial(vector<vector<int>>& mat,int row,int col){
        int rowSum = 0;
        int colSum = 0;
        for(int i = 0 ; i < mat.size(); i++ ){
                rowSum += mat[i][col];
        }
        
    for(int i = 0 ; i < mat[0].size(); i++){
        colSum += mat[row][i];

    }
    return (rowSum == 1 && colSum == 1);
    }
};