class Entry{
    int key;
    int value;
    public Entry(int key, int value){
        this.key = key;
        this.value = value;
    }
}
class MyHashMap {
    int capacity = 10;
    List<Entry>[] table;
    int size = 0;
    public MyHashMap() {
        this.table = new ArrayList[capacity];
        for(int i = 0; i < capacity; i++){
            table[i] = new ArrayList<>();
        }
    }
    
    public int hash(int key){
        return key % capacity;
    }
    public void put(int key, int value) {
        if(size == capacity){
            resize();
        }
        int index = hash(key);

        for(Entry e: table[index]){
            if(e.key == key){
                e.value = value;
                return;
            }  
        }
        table[index].add(new Entry(key,value));
        size++;
    }
    public int get(int key) {
        int ind = hash(key);
        for(Entry e: table[ind]){
            if(e.key == key){
                return e.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int ind = hash(key);
        Iterator<Entry> it = table[ind].iterator();
            while(it.hasNext()){
                if(it.next().key == key){
                it.remove();
                size--;
                return;
                }
            }
    }
    public void resize(){
        capacity = capacity * 2;
        List<Entry>[] oldTable = table;
        table = new ArrayList[capacity];

        for(int i = 0; i < capacity; i++){
            table[i] = new ArrayList<>();
        }
        size = 0;
        for(List<Entry> bucket : oldTable){
            for(Entry e: bucket){
                put(e.key, e.value);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */