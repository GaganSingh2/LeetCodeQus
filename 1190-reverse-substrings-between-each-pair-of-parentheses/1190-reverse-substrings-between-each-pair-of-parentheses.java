class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stk.push(ch);
            }
            else if(ch == ')'){
                StringBuilder sb = new StringBuilder("");
                while(!stk.isEmpty() && stk.peek() != '('){
                    sb.append(stk.pop());
                }
                stk.pop();
                int j = 0;
                while(j<sb.length()){
                    stk.push(sb.charAt(j));
                    j++;
                }
            }
            else{
                stk.push(ch);
            }
        }
        StringBuilder res = new StringBuilder("");
        while(!stk.isEmpty()){
            res.append(stk.pop());
        }
        return res.reverse().toString();
    }
}