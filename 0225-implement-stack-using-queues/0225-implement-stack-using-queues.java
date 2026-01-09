class MyStack {
    Queue<Integer> fir;
    Queue<Integer> sec;
    public MyStack() {
        fir = new LinkedList<>();
        sec = new LinkedList<>();
    }

//    // 1st Approach----- Push take O(n) and pop take O(1)
    // public boolean empty(){
    //     return fir.isEmpty();
    // }

    // //TC: O(n)
    // public void push(int x){
    //     while(!fir.isEmpty()){
    //         sec.add(fir.remove());
    //     }
    //     fir.add(x);
    //     while(!sec.isEmpty()){
    //         fir.add(sec.remove());
    //     }
    // }

    // //TC: O(1)
    // public int pop(){
    //    if(empty()){
    //         return -1;
    //    }
    //    return fir.remove();
    // }
 
    // public int top(){
    //    if(empty()){
    //         return -1;
    //    }
    //    return fir.peek();
    // }


    //2nd Approach----- Push take O(1) and pop O(n)
    public boolean empty(){
        return fir.isEmpty();
    }

    //TC: O(1)
    public void push(int x){
        fir.add(x);
    }

    //TC: O(n)
    public int pop(){
        if(empty()){
            return -1;
        }
        int top = 0;
        while(!fir.isEmpty()){
            top = fir.remove();
            if(empty()){
                break;
            }
            else{
                sec.add(top);
            }
        }
        while(!sec.isEmpty()){
            fir.add(sec.remove());
        }
        return top;
    }
 
    public int top(){
        if(empty()){
            return -1;
        }
        int top = 0;
        while(!fir.isEmpty()){
            top = fir.remove();
            sec.add(top);
        }
        while(!sec.isEmpty()){
            fir.add(sec.remove());
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

 /**
 1 2 3=> 3 2 1 stk
 q1 =3 
 q2 =1 2
  */