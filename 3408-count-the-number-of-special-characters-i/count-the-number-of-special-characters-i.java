class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> map= new HashSet<>();
        int cnt = 0;
        for(char ch : word.toCharArray()){
            if(!map.contains(ch)){
                map.add(ch);
            }
        }
        for(char ch: map){
                if(map.contains((char)(ch + 32))){
                    cnt++;
                }
            
        }
        return cnt;
    }
}