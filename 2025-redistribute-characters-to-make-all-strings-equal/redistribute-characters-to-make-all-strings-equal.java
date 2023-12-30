class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        for(String s:words){
            for(char ch : s.toCharArray()){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }
            }
        }
        for(int count: map.values()){
            if(count % words.length != 0){
                return false;
            }
        }
        return true;
    }
}
