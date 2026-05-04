class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String m = s + s;
        if(m.contains(goal)){
            return true;
        }
        return false;
    }
}