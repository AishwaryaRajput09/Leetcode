class Solution {
    public int maximumSwap(int num) {
        char arr[] = String.valueOf(num).toCharArray();
        int swap = 0;
        int ind =0;
        for(int i = 0; i < arr.length; i++){
            int maxInd = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[maxInd] <= arr[j]){
                    maxInd =  j;  
                }
            }
            if(arr[maxInd] > arr[i]){
                char temp = arr[i];
                arr[i]=arr[maxInd];
                arr[maxInd] = temp;
                break;
            }
        } 
        
        return Integer.parseInt(new String(arr));
    }
}