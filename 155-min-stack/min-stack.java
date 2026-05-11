class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        minStack = new Stack<>();
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        
        if(st.peek().equals(minStack.peek())){
        minStack.pop();
        }
        if(!st.isEmpty()){
        st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
       int el = minStack.peek();
       
        return el;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */