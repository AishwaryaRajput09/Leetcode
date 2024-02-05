class Solution {
    public char repeatedCharacter(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       for(char ch : s.toCharArray()){
           if(map.containsKey(ch)){
            //    map.put(ch,map.get(ch)+1);
               return ch;
           }else{
               map.put(ch,1);
           }
       }
    
       return '\0';
    }
}