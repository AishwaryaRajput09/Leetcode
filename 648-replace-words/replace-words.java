class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : dictionary){
            if(!map.containsKey(s)){
                map.put(s,s.length());
            }
        }
        // StringBuilder sb = new StringBuilder();
        String res = "";
        String [] line = sentence.split(" ");
        for(int i = 0; i < line.length; i++){
            for(String key: map.keySet()){
                if(line[i].startsWith(key)){
                    line[i] = key;
                }else{
                    continue;
                }
            }
        }
        for(String s : line){
                res += s;
                res += " ";
        }
        return res.trim();
    }
}