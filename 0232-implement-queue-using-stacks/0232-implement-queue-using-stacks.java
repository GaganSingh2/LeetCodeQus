class MyQueue {
    Stack<Integer> fir;
    Stack<Integer> sec;
    public MyQueue() {
        fir = new Stack<Integer>();
        sec = new Stack<Integer>();
    }
   
    //1st Way----- push take O(n) and pop take O(1)
    //TC: O(n)
    // public void push(int x){
        //put all value from fir stk to sec stk
    //    while(!fir.isEmpty()){
    //         sec.push(fir.pop());
    //    }
          //push new Value in fir stk
    //    fir.push(x);
          //put all value from fir stk to sec stk
    //    while(!sec.isEmpty()){
    //         fir.push(sec.pop());
    //    }
    // }

    //TC: O(1)
    // public int pop(){
    //     if(empty()){
    //         return -1;
    //     }
    //     return fir.pop();
    // }

    //TC: O(1)
    // public int peek(){
    //    if(empty()){
    //         return -1;
    //     }
    //     return fir.peek();
    // }
    
    // public boolean empty() {
    //    return fir.isEmpty();
    // }

    //2nd Way---- push take O(1) and pop take O(n)
    //TC: O(1)
    public void push(int x){
        fir.push(x);
    }

    //TC: O(n)
    public int pop(){
        //If first stk is empty means no value are there for removing
        if(empty()){
            return -1;
        }

        //Put all value from first stk to second stk
        while(!fir.isEmpty()){
            sec.push(fir.pop());
        }
        //pop top value from second stk
        int top = sec.pop();
        //Again, put all value from second stk to first stk
        while(!sec.isEmpty()){
            fir.push(sec.pop());
        }
        return top;
    }

    public int peek(){
        if(empty()){
            return -1;
        }
        while(!fir.isEmpty()){
            sec.push(fir.pop());
        }
        int top = sec.peek();
        while(!sec.isEmpty()){
            fir.push(sec.pop());
        }
        return top;
    }

    public boolean empty(){
        return fir.isEmpty();
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

 /*
 1 2 3 => 1 2 3
 s1 = 1 2 3 => 3 2 1
 s2 = 3 2 1 => 1 2 3
 */