class Solution {
    public int numberOfBeams(String[] bank) {
        int prevRow  = 0;
        int sum = 0;
      for(String s: bank){
        int currRow = calc(s);
        if(currRow == 0){
            continue;
        }
          sum += currRow * prevRow;
          prevRow = currRow;
         
      }  
      return sum;
    }
    int calc(String s){
       int count = 0;
        for(char ch : s.toCharArray()){
              if(ch == '1'){
                  count++;
              }
          }
          return count;
    }
}