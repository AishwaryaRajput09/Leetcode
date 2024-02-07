class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
         PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
         pq.addAll(map.keySet());
         StringBuilder res = new StringBuilder();
         while(!pq.isEmpty()){
             char c = pq.poll();
             for(int i = 0; i <map.get(c);i++){
                 res.append(c);
             }
         }
    return res.toString();
    }
}