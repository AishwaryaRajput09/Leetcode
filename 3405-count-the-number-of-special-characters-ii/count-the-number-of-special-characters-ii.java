class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt = 0;
        HashSet<Character> set = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                map.put(ch, i);
            }
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }
        }
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!set.contains(ch)){
            if(Character.isLowerCase(ch)){
                
                if(map.containsKey(Character.toUpperCase(ch))){
                    if(map.get(Character.toUpperCase(ch)) > map.get(ch)){
                    set.add(ch);
                    set.add(Character.toUpperCase(ch));
                        cnt++;
                    }
                }
            }else{
                if(map.containsKey(Character.toLowerCase(ch))){
                    if(map.get(Character.toLowerCase(ch)) < map.get(ch)){
                set.add(Character.toLowerCase(ch));
                set.add(ch);
                        cnt++;
                    }
                }
            }
            }
        }
        return cnt;
    }
}