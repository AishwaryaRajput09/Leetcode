class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        int len = 0; 
        while(j < s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
                len = Math.max(len, set.size());
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return len;
    }
}