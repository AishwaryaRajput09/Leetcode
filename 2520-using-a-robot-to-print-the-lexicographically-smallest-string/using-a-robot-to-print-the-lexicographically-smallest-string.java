class Solution {
    public String robotWithString(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) freq[ch - 'a']++;

        StringBuilder t = new StringBuilder();
        StringBuilder paper = new StringBuilder();

        char minChar = 'a';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            t.append(ch);
            freq[ch - 'a']--;

            while (minChar <= 'z' && freq[minChar - 'a'] == 0) {
                minChar++;
            }

            while (t.length() > 0 && t.charAt(t.length() - 1) <= minChar) {
                paper.append(t.charAt(t.length() - 1));
                t.setLength(t.length() - 1); // pop
            }
        }

        while (t.length() > 0) {
            paper.append(t.charAt(t.length() - 1));
            t.setLength(t.length() - 1);
        }

        return paper.toString();
    }
}
