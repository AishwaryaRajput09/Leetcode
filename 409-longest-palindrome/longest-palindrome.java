class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }
        int length = 0; 
        boolean hasOddfreq = false;
        for(int cnt: map.values()){
                length += cnt / 2 * 2;
                if(cnt % 2 == 1){
                    hasOddfreq = true;
                }
        }
        if(hasOddfreq){
            length += 1;
        }
        return length;
    }
}