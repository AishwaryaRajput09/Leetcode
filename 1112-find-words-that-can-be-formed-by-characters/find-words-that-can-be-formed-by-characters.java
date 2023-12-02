class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        
        int[] charCount = new int[26]; // Assuming lowercase English letters
        
        // Count the frequency of each character in chars
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Check if each word in words can be formed using chars
        for (String word : words) {
            int[] wordCount = new int[26];

            // Count the frequency of each character in the current word
            for (char c : word.toCharArray()) {
                wordCount[c - 'a']++;
            }

            // Check if the current word can be formed using chars
            boolean canFormWord = true;
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] > charCount[i]) {
                    canFormWord = false;
                    break;
                }
            }

            // If the word can be formed, add its length to the count
            if (canFormWord) {
                count += word.length();
            }
        }

        return count;
    }
}
