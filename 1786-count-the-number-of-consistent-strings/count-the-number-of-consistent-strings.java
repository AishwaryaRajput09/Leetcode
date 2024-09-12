class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean flag = false;
        int cnt = 0;
        Set<Character> set = new HashSet<>();
        for(char ch: allowed.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
            }
        }
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            flag = true;
            for(int j = 0; j < word.length();j++){
                if(!set.contains(word.charAt(j))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                cnt++;
            }
        }
        return cnt;
    }
}