class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    Node head;
    public MyLinkedList() {
    }
    
    public int get(int index) {
        if(head == null) return -1;
        Node temp = head;
        for(int i = 0; i < index; i++){
            if(temp.next == null) return -1;
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        if(head == null){
        head = new Node(val);
        return;
    }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
    }
    
    public void addAtIndex(int index, int val) {
       if(index == 0){
        addAtHead(val);
        return;
       }
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            if(temp == null) return;
            temp = temp.next;
        }
        if(temp == null) return;
        Node prev = temp; 
        Node forw = temp.next;
        prev.next = new Node(val);
        prev.next.next = forw;
    }
    
    public void deleteAtIndex(int index) {
        if(head == null) return;

    if(index == 0){
        head = head.next;
        return;
    }
        Node temp = head;
        
        for(int i = 0; i < index - 1; i++){
            if(temp.next == null) return;
            temp = temp.next;
        }
        if(temp.next!= null){
        temp.next = temp.next.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */