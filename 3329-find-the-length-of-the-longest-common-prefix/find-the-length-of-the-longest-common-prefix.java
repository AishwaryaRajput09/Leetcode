class TrieNode {
    TrieNode[] children = new TrieNode[10];
    boolean isEnd = false;
}

class Trie {
    TrieNode root = new TrieNode();

    public void insert(int number) {
        TrieNode current = root;
        String strNumber = Integer.toString(number);

        for (int i = 0; i < strNumber.length(); i++) {
            int digit = Character.getNumericValue(strNumber.charAt(i));
            if (current.children[digit] == null) {
                current.children[digit] = new TrieNode();
            }
            current = current.children[digit];
        }

        current.isEnd = true;
    }

    public int longestCommonPrefixLength(int number) {
        TrieNode current = root;
        String strNumber = Integer.toString(number);
        int lenNumber = 0;

        for (int i = 0; i < strNumber.length(); i++) {
            int digit = Character.getNumericValue(strNumber.charAt(i));
            if (current.children[digit] == null) {
                return lenNumber;
            }
            current = current.children[digit];
            lenNumber++;
        }

        return lenNumber;
    }
}

class Solution {
    public int longestCommonPrefix(int[] array1, int[] array2) {
        Trie trie = new Trie();
        int maxLength = 0;

        for (int number : array1) {
            trie.insert(number);
        }

        for (int number : array2) {
            maxLength = Math.max(maxLength, trie.longestCommonPrefixLength(number));
        }

        return maxLength;
    }
}