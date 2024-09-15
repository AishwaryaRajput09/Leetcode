class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
        firstOccurrence.put(0, -1);
        
        int bitmask = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                bitmask ^= (1 << 0);
            } else if (ch == 'e') {
                bitmask ^= (1 << 1);
            } else if (ch == 'i') {
                bitmask ^= (1 << 2);
            } else if (ch == 'o') {
                bitmask ^= (1 << 3);
            } else if (ch == 'u') {
                bitmask ^= (1 << 4);
            }

            if (firstOccurrence.containsKey(bitmask)) {
                int prevIndex = firstOccurrence.get(bitmask);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                firstOccurrence.put(bitmask, i);
            }
        }

        return maxLength;
    }
}
