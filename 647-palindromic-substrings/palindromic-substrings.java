// class Solution {
//     public int countSubstrings(String s) {
//         int cnt = 0;
//         for(int i = 0 ; i < s.length(); i++){
//             for(int j = i; j < s.length();j++){
//                 if(helper(i,j,s)){
//                     cnt++;
//                 }
//             }
//         }
//         return cnt;

//     }
//     public boolean helper(int s, int e, String p){
        
//         while(s < e){
//             if(p.charAt(s) != p.charAt(e)){
//                 return false;
//             }
//             s++;
//             e--;
            
//         }
//         return true;
//     }
// }
// class Solution {
//     public int countSubstrings(String s) {
//         int count = 0;
//         int n = s.length();

//         for (int i = 0; i < 2 * n - 1; i++) {
//             int left = i / 2;
//             int right = left + i % 2;

//             while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
//                 count++;
//                 left--;
//                 right++;
//             }
//         }

//         return count;
//     }
// }
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        // All individual characters are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            count++;
        }

        // Check for palindromic substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                count++;
            }
        }

        // Check for palindromic substrings of length 3 or more
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    count++;
                }
            }
        }

        return count;
    }
}
