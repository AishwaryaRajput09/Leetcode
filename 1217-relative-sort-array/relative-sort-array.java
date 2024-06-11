class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: arr1){
            if(map.containsKey(n)){
                map.put(n,map.get(n) + 1);
            }else{
                map.put(n,1);
            }
        }
        int ind = 0;
        int size = 0;
        for(int n : arr2){
            int cnt = map.get(n);
            for(int i = 0; i < cnt; i++){
                arr1[ind++] = n;
                map.remove(n);
            }
            
        }
        ArrayList<Integer> leftover= new ArrayList<>();
        for(int key: map.keySet()){
            int cnt = map.get(key);
            for(int i=0; i< cnt;i++){
                leftover.add(key);
            }
        }
        Collections.sort(leftover);
        for(int n: leftover){
            arr1[ind++] = n;
        }
       return arr1;
    }
    }
