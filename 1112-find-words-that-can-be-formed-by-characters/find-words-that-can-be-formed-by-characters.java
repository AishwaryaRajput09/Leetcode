class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        Map<Character,Integer> charFreq = new HashMap<>();
        for(char ch : chars.toCharArray()){
            charFreq.put(ch,charFreq.getOrDefault(ch,0)+1);
        }
        for(String s: words){
        Map<Character,Integer> freq = new HashMap<>();
            for(char c:s.toCharArray()){
             freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
            boolean canForm = true;
            for(char c: freq.keySet()){
                if(!charFreq.containsKey(c)|| charFreq.get(c) < freq.get(c)){
                    canForm = false;
                    break;
                }
            }
            if(canForm){
                count+=s.length();
            }
        }

        return count;
    }   
    
}