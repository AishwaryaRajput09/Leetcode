class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int len = 0;
        HashSet<Character> set = new HashSet<>();
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
              set.add(s.charAt(j));
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