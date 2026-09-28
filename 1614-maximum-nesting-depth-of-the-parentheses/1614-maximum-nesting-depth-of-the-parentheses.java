class Solution {
    public int maxDepth(String s) {
        int maximumDepth = 0;
        int curr = 0;
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stk.push(ch);
                curr++;
            }
            else if(ch == ')'){
                maximumDepth = Math.max(maximumDepth, curr);
                while(!stk.isEmpty() && stk.peek() != '('){
                    stk.pop();
                }
                stk.pop();
                curr--;
            }
            else{
                stk.push(ch);
            }
        }
        return maximumDepth;
    }
}