class MinStack {
    private Stack<Integer> temp;

    public MinStack() {
        temp = new Stack<>();
    }
    int min = Integer.MAX_VALUE;
    public void push(int val) {
        if(min >= val){
            temp.push(min);
            min = val;
        }
        temp.push(val);
    }
    
    public void pop() {
        if(min == temp.pop()){
            min = temp.pop();
        }
        
    }
    
    public int top() {
        return temp.peek();
    }
    
    public int getMin() {
        return min;
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