class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char word[] = s.toCharArray();
        for(int i=0; i<word.length; i++){
            char ch = word[i];
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if((ch == ')' && stack.peek()=='(') || (ch == ']' && stack.peek()=='[')
                   || (ch == '}' && stack.peek()=='{')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}