class Solution {
    public int maxDepth(String s) {
        //Approach-1: Using Counter TC: O(n) & SC: O(1)
        int openBracketCnt = 0;
        int maximumDepth = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                openBracketCnt++;
            }
            else if(ch == ')' && openBracketCnt != 0){
                maximumDepth = Math.max(maximumDepth, openBracketCnt);
                openBracketCnt--;
            }
        }
        return maximumDepth;


        //Approach-2: using Stack TC: O(n) & SC: O(n)
        // int maximumDepth = 0;
        // int curr = 0;
        // Stack<Character> stk = new Stack<>();
        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch == '('){
        //         stk.push(ch);
        //         curr++;
        //     }
        //     else if(ch == ')'){
        //         maximumDepth = Math.max(maximumDepth, curr);
        //         while(!stk.isEmpty() && stk.peek() != '('){
        //             stk.pop();
        //         }
        //         stk.pop();
        //         curr--;
        //     }
        //     else{
        //         stk.push(ch);
        //     }
        // }
        // return maximumDepth;
    }
}