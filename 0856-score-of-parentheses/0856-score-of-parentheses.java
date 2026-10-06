class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stk.push(0);
                
            }
            else{
                
                int innerScore = stk.pop();
                int score;
                if(innerScore == 0){
                    score = 1;  //()
                }
                else{
                    score = 2 * innerScore; //(A)
                }
                int prev = stk.pop();
                stk.push(prev+score);
            }
        }
        return stk.pop();
    }
}