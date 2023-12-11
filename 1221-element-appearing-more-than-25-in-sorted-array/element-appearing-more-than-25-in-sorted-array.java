class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        int count = 1;
        double per = 25.0;
        double res =( per / 100 ) * arr.length;
        for(int i = 1; i < arr.length;i++){
            if(arr[i]==arr[i-1]){
               count++;
            //   ans = arr[i];
        if(count > res){
            return arr[i];
          
            }      
        }else{
            count = 1;
        }
}
         return -1;
    }
}