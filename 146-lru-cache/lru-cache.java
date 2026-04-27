class DoublyLinkedListNode{
    int key;
    int val;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;
    DoublyLinkedListNode(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    private int capacity;
    HashMap<Integer, DoublyLinkedListNode> map;

    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new DoublyLinkedListNode(-1,-1);
        this.tail = new DoublyLinkedListNode(-1,-1);
        this.head.next = tail;
        this.tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        DoublyLinkedListNode node = map.get(key);
        removeNode(node);
        addToHead(node);
        return node.val;
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            removeNode(map.get(key));
        }
        DoublyLinkedListNode node = new DoublyLinkedListNode (key, value);
        map.put(key, node);
        if(map.size() > capacity){
            DoublyLinkedListNode lru = tail.prev;
            map.remove(lru.key);
            removeNode(lru);
        }
        addToHead(node);
    }

    private void addToHead(DoublyLinkedListNode node){
        DoublyLinkedListNode forw = head.next;
        head.next = node;
        node.next = forw;
        forw.prev = node;
        node.prev = head;
    }
    private void removeNode(DoublyLinkedListNode node){
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