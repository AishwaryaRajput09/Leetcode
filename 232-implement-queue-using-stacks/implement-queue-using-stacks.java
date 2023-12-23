class MyQueue {
    private Stack<Integer> st1;
    private Stack<Integer> st2;
    public MyQueue() {
         st1 = new Stack<>();
         st2 = new Stack<>();

    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        if(st2.isEmpty()){
            while(!st1.isEmpty()){

            st2.push(st1.pop());
            }
        }
        if(!st2.isEmpty()){
            return st2.pop();
        }
        return 0;
    }
    
    public int peek() {
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        if(!st2.isEmpty()){
            return st2.peek();
        }
        return 0;
    }
    
    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */