class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        int i = 0;
        if(s.length() != t.length()){
            return false;
        }
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(c,t.charAt(i));
            }else{
                if(map.get(c) != t.charAt(i)){
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}