class Solution {
    public int maxDifference(String s) {
        char [] arr = new char[26];
        for(char ch : s.toCharArray()){
            if (ch >= 'a' && ch <= 'z') {
    arr[ch - 'a']++;
    }
        }
        Arrays.sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
        int st = arr.length - 1;
        int en = arr.length - 1;
        int t1 = 0;
        int t2 = 0;
        while(st >= 0 && en >= 0 ){
            if(arr[st] > 0 && arr[st] % 2 == 0){
                t1 = arr[st];
                st--;
            }else{
                st--;
            }
            if(arr[en] % 2 != 0){
                t2 = arr[en];
            }else{
                en--;
            }
            
        }
        return t2 - t1;
    }
}