class MyHashSet {
    int[] arr;
    int size = 0;
    int capacity = 10;
    public MyHashSet() {
        this.arr = new int[capacity];
    }
    
    public void add(int key) {
        if(size == capacity) resize();
        if(!contains(key)){
            arr[size++] = key;
            return;
        }
    }
    public void resize(){
        capacity = capacity * 2;
        int[] newArr = new int[capacity];
        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public void remove(int key) {
        for(int i = 0; i < size; i++){
            if(arr[i] == key){
                for(int j = i; j < size - 1; j++){
                    arr[j] = arr[j+1];
                }
            size--;
            return;
            }
        }
    }
    
    public boolean contains(int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */