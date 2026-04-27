class DoublyLinkedList{
        int key;
        int val;
        DoublyLinkedList prev;
        DoublyLinkedList next;
        DoublyLinkedList(int key, int val){
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }
class LRUCache {
    int capacity;
    
    private DoublyLinkedList head ;
    private DoublyLinkedList tail ;
    HashMap<Integer, DoublyLinkedList> map = new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new DoublyLinkedList(-1,-1);
        this.tail = new DoublyLinkedList(-1,-1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        DoublyLinkedList node = map.get(key);
        removeNode(node);
        addToTail(node);
        return tail.prev.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            removeNode(map.get(key));
        }
        DoublyLinkedList node = new DoublyLinkedList(key, value);
        map.put(key, node);
        if(map.size() > capacity){
            DoublyLinkedList lru = head.next;
            map.remove(lru.key);
            removeNode(lru);
        }
           
        addToTail(node);
    }
    private void addToTail(DoublyLinkedList node){
        DoublyLinkedList prevNode = tail.prev;
        node.prev = prevNode;
        node.next = tail;
        prevNode.next = node;
        tail.prev = node;
    }
    private void removeNode(DoublyLinkedList node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */