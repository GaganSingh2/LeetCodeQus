class MyStack {
    private Queue<Integer> first;
    private Queue<Integer> second;
    public MyStack() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }
    
    // 1st Approach----
    // public void push(int x) { //O(n)
    //     while(!first.isEmpty()){
    //         second.add(first.poll());
    //     }
    //     first.add(x);
    //     while(!second.isEmpty()){
    //         first.add(second.poll());
    //     }
    // }
    
    // public int pop() {  //O(1)
    //     return first.poll();
    // }
    
    // public int top() {  //O(1)
    //     return first.peek();
    // }
    
    // public boolean empty() {
    //     return first.isEmpty();
    // }

    // 2nd Approach-----
    public boolean empty(){
        return first.isEmpty() && second.isEmpty();
    }

    // Add O(1)
    public void push(int x){
        if(!first.isEmpty()){
            first.add(x);
        }else{
            second.add(x);
        }
    }

    // Pop O(n)
    public int pop(){
        if(empty()){
            return -1;
        }
        int top = -1;
        // if Queue1 is Non-empty then push the whole data in queue2
        if(!first.isEmpty()){
            while(!first.isEmpty()){
                top = first.poll();
                if(first.isEmpty()){
                    break;
                }
                second.add(top);
            }
        }
        else{
            while(!second.isEmpty()){
                top = second.poll();
                if(second.isEmpty()){
                    break;
                }
                first.add(top);
            }
        }
        return top;
    }

    // Peek O(n)
    public int top(){
        if(empty()){
            return -1;
        }
        int top = -1;
        // if Queue1 is Non-empty then push the whole data in queue2
        if(!first.isEmpty()){
            while(!first.isEmpty()){
                top = first.poll();
                second.add(top);
            }
        }
        else{
            while(!second.isEmpty()){
                top = second.poll();
                first.add(top);
            }
        }
        return top;
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */