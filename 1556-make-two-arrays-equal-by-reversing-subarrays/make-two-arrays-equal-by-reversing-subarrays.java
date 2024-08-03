class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: arr){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(target[i])){
                map.put(target[i],map.get(target[i])-1);
            }else{
                return false;
            }
        }
        for(int k : map.values()){
            if(k > 0){
                return false;
            }
        }
        return true;
    }
}