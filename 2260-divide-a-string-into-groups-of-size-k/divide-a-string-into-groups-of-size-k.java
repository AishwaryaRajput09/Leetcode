class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int toFill = k -(len % k);
        int arrLen = 0;
        if(len % k != 0){
        arrLen = (len/k) + 1;

        for(int i = 0; i < toFill; i++){
            s += fill;
        }
        }else{
            arrLen = (len/k);
        }
        String[] sArr = new String[arrLen];
        int j = 0;
        for(int i = 0; i < s.length() && i+k <= s.length(); i+=k){
            sArr[j++] = s.substring(i,i+k);
           
        }
        return sArr;
    }
}