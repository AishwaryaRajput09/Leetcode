class Solution {
    public int numberOfBeams(String[] bank) {
        // int prevRow  = 0;
        List<Integer> save = new ArrayList<>();
      for(String s: bank){
        int currRow = 0;
        for(char ch : s.toCharArray()){
              if(ch == '1'){
                  currRow++;
              }
          }
        if(currRow != 0){
            save.add(currRow);
        }
       
         
      }  
       int sum = 0;
          for(int i = 1 ; i < save.size();i++){
              sum += save.get(i) * save.get(i-1);
          }
      return sum;
    }

}