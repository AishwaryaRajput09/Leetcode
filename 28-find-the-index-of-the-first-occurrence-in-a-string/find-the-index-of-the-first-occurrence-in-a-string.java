class Solution {
    public int strStr(String h, String n) {
        int start = 0;
        int st2 = 0;
        int end = h.length();
        int e = n.length();
        if(end < e){
            return -1;
        }
        while( start - st2 <= end - e){
            if(st2 < e && n.charAt(st2) == h.charAt(start)){
                st2++;
                start++;
                // e--;
                }else{
                    start = start - st2 + 1;
                    st2 = 0;
                }

        if(st2 == e){
            return start - e;
        }
        }
        return -1;
    }
}