class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int n = fruits.length;
        int maxFruits = 0;
        while(j < n){
        
            int frt = fruits[j];
                if(map.containsKey(frt)){
                    map.put(frt,map.get(frt)+1);
                }else{
                    map.put(frt,1);
                }
                 
                
            
            
                while(map.size() > 2){
                map.put(fruits[i], map.get(fruits[i]) - 1);
                 if(map.get(fruits[i]) == 0) {
                   map.remove(fruits[i]);
                 }
                i++;
            }
   maxFruits = Math.max(maxFruits, j - i + 1);
   j++;
            }   
        return maxFruits;
             }
}

//[1,2,1] :  so first declaring the hashmap for storing the fruit type 