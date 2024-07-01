class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int cnt = 0;
            int j = i;
            int k = 0;
            while(j < arr.length && k < 3){
                if(arr[j] % 2 == 1){
                    cnt++;
                }else{
                    break;
                }
                j++;
            if(cnt == 3) return true;
            }
            i++;
        }
        return false;
    }
}