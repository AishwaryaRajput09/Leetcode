
class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        Map<Character, Integer> charFreq = new HashMap<>();

        // Count the frequency of each character in chars
        for (char c : chars.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        // Check if each word in words can be formed using chars
        for (String word : words) {
            // Create a copy of the character frequency map for each word
            Map<Character, Integer> wordFreq = new HashMap<>(charFreq);

            // Check if the current word can be formed using chars
            boolean canFormWord = true;
            for (char c : word.toCharArray()) {
                if (!wordFreq.containsKey(c) || wordFreq.get(c) == 0) {
                    canFormWord = false;
                    break;
                }
                wordFreq.put(c, wordFreq.get(c) - 1);
            }

            // If the word can be formed, add its length to the count
            if (canFormWord) {
                count += word.length();
            }
        }

        return count;
    }
}
