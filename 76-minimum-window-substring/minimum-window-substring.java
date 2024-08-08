class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> targetF = new HashMap<>();
        if(s == null || t == null || s.length() < t.length()) return "";
        for(char ch : t.toCharArray()){
            if(targetF.containsKey(ch)){
                targetF.put(ch,targetF.get(ch)+1);
            }else{
                targetF.put(ch,1);
            }

        }
        int i = 0;
        int j = 0;
        int n = s.length();
        int requiredChar = targetF.size();
        int formedChar = 0;
        int minLen = Integer.MAX_VALUE;
       String result = "";
        HashMap<Character,Integer> windowF = new HashMap<>();
        while(j < n){
            char ch = s.charAt(j);
            windowF.put(ch,windowF.getOrDefault(ch,0)+1);
            if(targetF.containsKey(ch) && windowF.get(ch).equals(targetF.get(ch))){
                formedChar++;
            }
            while(i <= j && formedChar == requiredChar){
                char c = s.charAt(i);
                if(j - i + 1 < minLen){
                    minLen =  j - i + 1;
                    result = s.substring(i,j+ 1); 
                }
                
                windowF.put(c,windowF.get(c)-1);
                if(targetF.containsKey(c) && windowF.get(c) < targetF.get(c)){
                    formedChar--;
                }
                i++;
                
            }
            j++;
        }
        return result;
    }
}