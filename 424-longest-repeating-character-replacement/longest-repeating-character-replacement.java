class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int maxHighFreq = 0;
        int curr = 0;
        int start = 0;
        int maxSubStr = 0;
        while (curr < s.length()) {
            char ch = s.charAt(curr);
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
                maxHighFreq = Math.max(maxHighFreq, freq.get(ch));
            } else {
                freq.put(ch, 1);
                maxHighFreq = Math.max(maxHighFreq, 1);
            }
            int windowLen = curr - start + 1;
            if (windowLen - maxHighFreq <= k) {
                maxSubStr = Math.max(maxSubStr, windowLen);
            } else if (windowLen - maxHighFreq > k) {
                if (freq.containsKey(s.charAt(start))) {
                    freq.put(s.charAt(start), freq.get(s.charAt(start)) - 1);
                    start++;
                }
            }
            curr++;
        }
        return maxSubStr;
    }
}