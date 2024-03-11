class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        String prsnt = "";
        String nprsnt = "";
        for(char ch : order.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(map.containsKey(curr)){
                prsnt += curr;
            }else{
                nprsnt += curr;
            }
        }
        String ans = "";
        if(prsnt.length()==order.length()){
             return order+nprsnt;
        }else{
            for(int i = 0; i < order.length();i++){
                for(int j = 0; j <prsnt.length() ;j++){
                    if(order.charAt(i)==prsnt.charAt(j)){
                        ans += order.charAt(i);
                    }
                }
            }
        }
       return ans+nprsnt;
    }
}