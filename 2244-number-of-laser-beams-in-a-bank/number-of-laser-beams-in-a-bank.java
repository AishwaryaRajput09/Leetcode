class Solution {
    public int numberOfBeams(String[] bank) {
        int prevRow  = 0;
        int sum = 0;
      for(String s: bank){
        int currRow = 0;
        for(char ch : s.toCharArray()){
              if(ch == '1'){
                  currRow++;
              }
          }
        if(currRow == 0){
            continue;
        }
          sum += currRow * prevRow;
          prevRow = currRow;
         
      }  
      return sum;
    }

}