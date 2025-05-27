import java.util.regex.*;
class Solution {
    public boolean isMatch(String s, String p) {
        Pattern pt = Pattern.compile(p);
        Matcher mt = pt.matcher(s); 
        return mt.matches();
    }
}