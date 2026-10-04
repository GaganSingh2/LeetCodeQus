class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() == 0){
            return 0;
        }
        int maxLen = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
    
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stk.push(i);
            }
            else{
                stk.pop();
                if(stk.isEmpty()){
                    stk.push(i);
                }
                else{
                    int currLen = i - stk.peek();
                    maxLen = Math.max(maxLen, currLen);
                }
            }
        }
        return maxLen;
    }
}