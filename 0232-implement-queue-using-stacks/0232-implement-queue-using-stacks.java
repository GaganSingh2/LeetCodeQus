class MyQueue {
    static Stack<Integer> first;
    static Stack<Integer> second;
    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }
    
    // 1st way
    public void push(int x) { //O(n)
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(x);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }
    
    public int pop() { //O(1)
        if(empty()){
            return -1;
        }
        return first.pop();
    }
    
    public int peek() { //O(1)
        if(empty()){
            return -1;
        }
        return first.peek();
    }
    
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
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