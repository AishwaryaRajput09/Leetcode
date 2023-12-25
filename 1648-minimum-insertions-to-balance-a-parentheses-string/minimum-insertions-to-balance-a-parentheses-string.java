class Solution {
    public int minInsertions(String s) {
        int res = 0;
        int Close = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                Close += 2;
                if (Close % 2 == 1) {
                    Close--;
                    res++;
                }
            } else {
                Close--;
                if (Close < 0) {
                    res++;
                    Close += 2;
                }
                
            }
        }
        return res + Close;
    }
}