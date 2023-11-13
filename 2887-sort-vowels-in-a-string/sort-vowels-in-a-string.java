class Solution {
    public String sortVowels(String s) {
        char[] chars = s.toCharArray();
        List<Character> vowels = new ArrayList<>();
        List<Integer> vowelIndices = new ArrayList<>();

        // Collect vowels and their indices
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (isVowel(c)) {
                vowels.add(c);
                vowelIndices.add(i);
            }
        }

        // Sort vowels
        Collections.sort(vowels);

        // Reconstruct the string
        Iterator<Integer> indexIterator = vowelIndices.iterator();
        for (char vowel : vowels) {
            chars[indexIterator.next()] = vowel;
        }

        return new String(chars);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
