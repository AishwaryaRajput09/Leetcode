class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> consonent = new HashMap<>();
        vowel.put('a',0);
        vowel.put('i',0);
        vowel.put('e',0);
        vowel.put('o',0);
        vowel.put('u',0);
        int vowelCnt = 0;
        int conCnt = 0;
        for(char c: s.toCharArray()){
            if(!vowel.containsKey(c)){
                if(!consonent.containsKey(c)){

                consonent.put(c,1);
                }else{

                consonent.put(c,consonent.get(c)+1);
                }
            }else{
                vowel.put(c, vowel.get(c)+1);
            }
        }
     for(int i : vowel.values()){
        if(i > vowelCnt){
            vowelCnt = i;
        }
        System.out.println(i);
     }
     for(int i : consonent.values()){
        if(i > conCnt){
            conCnt = i;
        }
        System.out.println(i);
     }
     
    return vowelCnt + conCnt;
    }
}