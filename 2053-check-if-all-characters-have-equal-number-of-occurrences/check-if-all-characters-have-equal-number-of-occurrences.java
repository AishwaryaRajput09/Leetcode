class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int f = -1;
        for(int count: map.values()){
            if(f == -1){
                f = count;
            }else if (f != count){
                return false;
            }
        }
        return true;
    }
}