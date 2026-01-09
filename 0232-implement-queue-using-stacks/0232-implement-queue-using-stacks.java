class MyQueue {
    Stack<Integer> fir;
    Stack<Integer> sec;
    public MyQueue() {
        fir = new Stack<Integer>();
        sec = new Stack<Integer>();
    }
   
    //1st Way----- push take O(n) and pop take O(1)
    public void push(int x){
       while(!fir.isEmpty()){
            sec.push(fir.pop());
       }
       fir.push(x);
       while(!sec.isEmpty()){
            fir.push(sec.pop());
       }
    }

    public int pop(){
        if(empty()){
            return -1;
        }
        return fir.pop();
    }

    public int peek(){
       if(empty()){
            return -1;
        }
        return fir.peek();
    }
    public boolean empty() {
       return fir.isEmpty();
    }

    //2nd Way---- push take O(1) and pop take O(n)
    // public void push(int x){

    // }

    // public int pop(){

    // }

    // public int peek(){

    // }

    // public boolean empty(){

    // }
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
 1 2 3=> 1 2 3
 1 2 3 =>3 2 1
 s1 = 3 2 1 => 1 2 3
 s2 = 
 */