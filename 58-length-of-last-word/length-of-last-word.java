class Solution {
    public int lengthOfLastWord(String s) {
        String st[] = s.split(" ");
        int max = 0;
        int n = st.length - 1;
        max = st[n].length();

        return max;
    }
}