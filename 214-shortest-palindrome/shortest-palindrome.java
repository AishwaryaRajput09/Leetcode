class Solution {
    public String shortestPalindrome(String s) {
        String rev_s = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev_s;
        int[] kmp = buildKMPTable(combined);
        int maxPalindromeLength = kmp[kmp.length - 1];
        String toAdd = s.substring(maxPalindromeLength);
        return new StringBuilder(toAdd).reverse().toString() + s;
    }

    private int[] buildKMPTable(String s) {
        int n = s.length();
        int[] kmp = new int[n];
        int j = 0;
        for (int i = 1; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = kmp[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            kmp[i] = j;
        }
        return kmp;
    }
}
