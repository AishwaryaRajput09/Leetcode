class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int k = p.length();
        if(s.length() < k){
            return list;
        }
        for(char ch : p.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int cnt = map.size();
        int i = 0;
        int j = 0;
        while( j < s.length()){
             char c = s.charAt(j);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                        cnt--;
                    }
            }
            if(j - i + 1 < k){
                j++;
            }
           else if(j - i + 1  == k){
                if(cnt == 0){
                    list.add(i);
                }
                char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                if(map.get(ch) == 1){
                    cnt++;
                }
            }
            j++;
            i++;
        
            }
        }
        return list;
    }
}