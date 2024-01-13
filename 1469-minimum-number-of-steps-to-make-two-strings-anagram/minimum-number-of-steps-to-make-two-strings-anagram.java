class Solution {
    public int minSteps(String s, String t) {
         int cnt = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for (char c : t.toCharArray()) {
            if(map.containsKey(c)){
                if(map.get(c) > 0){
                    map.put(c,map.get(c)-1);
                }else{
                    cnt++;
                }
            }else{
                cnt++;
            }
            
        }

        return cnt;
    }
}