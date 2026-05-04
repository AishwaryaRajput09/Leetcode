class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int len = s.length();
        int maxLen = 0;
        HashSet<Character> isPresent = new HashSet<>();
        while(j < len){
            char ch = s.charAt(j);
            if(!isPresent.contains(ch)){
                isPresent.add(ch);
               maxLen = Math.max(maxLen, isPresent.size());
               j++;
            }else{
                isPresent.remove(s.charAt(i));
                i++;
            }
        }
        return maxLen;
    }
}