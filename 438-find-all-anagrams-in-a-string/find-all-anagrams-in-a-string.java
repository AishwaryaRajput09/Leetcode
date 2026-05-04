class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length())
            return list;
        int[] expected_freq = new int[26];
        int[] window_freq = new int[26];
        for (char c : p.toCharArray()) {
            expected_freq[c - 'a'] += 1;
        }
        int right = 0;
        int left = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            window_freq[ch - 'a'] += 1;
            if (right - left + 1 == p.length()) {
                boolean isMatch = true;
                for (int i = 0; i < 26; i++) {
                    if (window_freq[i] != expected_freq[i]) {
                        isMatch = false;
                        break;
                    }
                }
                if(isMatch){
                    list.add(left);
                }
                window_freq[s.charAt(left) - 'a'] -= 1;
                left++;
            }
            right++;

        }
    return list;
    }
}