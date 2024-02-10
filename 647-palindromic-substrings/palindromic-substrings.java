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
class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < 2 * n - 1; i++) {
            int left = i / 2;
            int right = left + i % 2;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }
}
