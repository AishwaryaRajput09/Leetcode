class Solution {
    public int bulbSwitch(int n) {
        // boolean bulbs[] = new boolean[n];
        // int cnt = 0;
        // for(int i = 1; i <= n; i++){
        //     for(int j = i; j <= n; j = j+i){
        //        if(bulbs[j-1] == true){
        //         bulbs[j-1] = false;
        //        }else{
        //         bulbs[j-1] = true;
        //        }
               
        //     }
        //     for(boolean flag: bulbs){
        //     System.out.print(flag + " ");
        // }
        // System.out.println();
        // }
        // for(boolean flag: bulbs){
        //     if(flag) cnt++;
        // }
        return (int) Math.sqrt(n);
    }
}