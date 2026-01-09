class MyStack {
    Queue<Integer> fir;
    Queue<Integer> sec;
    public MyStack() {
        fir = new LinkedList<>();
        sec = new LinkedList<>();
    }

    // 1st Approach----- Push take O(n) and pop take O(1)
    public boolean empty(){
        return fir.isEmpty();
    }

    //TC: O(n)
    public void push(int x){
        while(!fir.isEmpty()){
            sec.add(fir.remove());
        }
        fir.add(x);
        while(!sec.isEmpty()){
            fir.add(sec.remove());
        }
    }

    //TC: O(1)
    public int pop(){
       if(empty()){
            return -1;
       }
       return fir.remove();
    }

    
    public int top(){
       if(empty()){
            return -1;
       }
       return fir.peek();
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

 /**
 1 2 3=> 3 2 1 stk
 q1 = 3 2 1
 q2 = 2 1
  */