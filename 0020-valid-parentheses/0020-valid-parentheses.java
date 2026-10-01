class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stk.push(ch);
            }
            else{
                if(stk.isEmpty()){
                    return false;
                }
                else if((ch == ')' && stk.peek() == '(') || (ch == ']' && stk.peek() == '[') 
                    || (ch == '}' && stk.peek() == '{')){
                        stk.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stk.isEmpty();    
    }
}