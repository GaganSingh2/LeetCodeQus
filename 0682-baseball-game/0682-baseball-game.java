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
                prev = temp.pop();
                prev2 = temp.peek();
                temp.push(prev);
                int sum = prev+prev2;
                prev2 = prev;
                prev = sum;
                temp.push(sum);
            }
            else if(ch.equals("D")){
                prev = temp.peek();
                int doub = prev*2;
                
                prev2 = prev;
                prev = doub;
                temp.push(doub);
            }
            else if(ch.equals("C")){
                if(!temp.isEmpty()){
                    temp.pop();
                    prev = prev2;
                    prev2 = prev3;
                    prev3 = 0;
                     if(!temp.isEmpty()){
                        prev = temp.peek();
                     }
                   
                }
                else{
                    return 0;
                }
                
            }
            else{
                if(temp.isEmpty()){
                    prev2 = 0;
                }
                else{
                    prev2 = temp.peek();
                }
                
                prev = val;
                temp.push(val);
                
            }
        }
        while(!temp.isEmpty()){
            
            finRes += temp.pop();
        }
        return finRes;
    }
}