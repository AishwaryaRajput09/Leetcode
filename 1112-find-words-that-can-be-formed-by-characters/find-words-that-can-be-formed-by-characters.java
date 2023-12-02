class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];
        for(int i = 0; i< chars.length();i++){
            counts[chars.charAt(i)-'a']++;
        }

        int ans=0;
        for(String s: words){
        if(canFom(s,counts))
            ans+=s.length();
        }
        return ans;
}
    public boolean canFom(String s ,int[] count){
        int c [] = new int[26];
         for(int i = 0; i<s.length();i++ ){
            int x = s.charAt(i)-'a';
            c[x]++;
            if(c[x]>count[x])
                return false;
            }
         return true;
     }
}