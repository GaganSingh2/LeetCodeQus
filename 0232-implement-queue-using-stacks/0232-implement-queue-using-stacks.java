class MyQueue {
    static Stack<Integer> first;
    static Stack<Integer> second;
    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }
    
    // 1st Approach
    // public void push(int x) { //O(n)
    //     while(!first.isEmpty()){
    //         second.push(first.pop());
    //     }
    //     first.push(x);
    //     while(!second.isEmpty()){
    //         first.push(second.pop());
    //     }
    // }
    
    // public int pop() { //O(1)
    //     if(empty()){
    //         return -1;
    //     }
    //     return first.pop();
    // }
    
    // public int peek() { //O(1)
    //     if(empty()){
    //         return -1;
    //     }
    //     return first.peek();
    // }

    // 2nd Approach
    public void push(int x){
        first.push(x);
    }

    public int pop(){
        if(first.isEmpty() && second.isEmpty()){
            return -1;
        }
        // if stack2 is empty but stack1 have some data
        if(second.isEmpty()){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
        return second.pop();
    }

    public int peek(){
       if(first.isEmpty() && second.isEmpty()){
            return -1;
        }
        // if stack2 is empty but stack1 have some data
        if(second.isEmpty()){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
        return second.peek();
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