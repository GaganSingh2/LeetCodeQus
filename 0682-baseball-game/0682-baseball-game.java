class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> temp = new Stack<>();
        int finRes = 0;
        int prev = 0, prev2 = 0,prev3 = 0;
        for(int i=0; i<operations.length; i++){
            
            String ch = operations[i];
            int val = 0;
            if(!ch.equals("+") && !ch.equals("D") && !ch.equals("C")){
                val = Integer.valueOf(ch);
            } 
            
            if(ch.equals("+")){
                
                int val1 = temp.pop();
                int val2 = temp.peek();
                temp.push(val1);
                temp.push(val1 + val2);
            }
            else if(ch.equals("D")){
                

                temp.push(temp.peek()*2);
            }
            else if(ch.equals("C")){
                

                temp.pop();
                
            }
            else{
                
                temp.push(val);
                
            }
        }
        while(!temp.isEmpty()){
            
            finRes += temp.pop();
        }
        return finRes;
    }
}