import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] KEYPAD_MAPPING = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return pad("", digits);
    }

    private List<String> pad(String p, String up) {
        List<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        String chars = KEYPAD_MAPPING[digit];
        for (int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);
            list.addAll(pad(p + ch, up.substring(1)));
        }
        return list;
    }
}
