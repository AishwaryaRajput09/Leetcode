class RandomizedSet {
    Map <Integer,Integer> map;     
    public RandomizedSet() {
           map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val,1);
            return true;
        }else{
            map.put(val,map.get(val)+1);
        return false;
        }
    }
    
    public boolean remove(int val) {
        return map.remove(val) != null;
    }
    
    public int getRandom() {
        List<Integer> values = new ArrayList<>(map.keySet());
        Random rand = new Random();
        return values.get(rand.nextInt(values.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */