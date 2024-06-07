class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> dictSet = new HashSet<>(dictionary);
    
        String [] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word: words){
            String prefix = null;
           for(int i = 1; i <= word.length(); i++){
            String substr = word.substring(0,i);
            if(dictSet.contains(substr)){
                prefix = substr;
                break;
            }
           }
           if(prefix != null){
            res.append(prefix).append(" ");
           }else{
            res.append(word).append(" ");
           }
        }
        return res.toString().trim();
    }
}