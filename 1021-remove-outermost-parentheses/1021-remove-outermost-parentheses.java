class Solution {
    public String removeOuterParentheses(String s) {
        // StringBuilder res = new StringBuilder("");
        // int level = 0;
        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch == '('){
        //         if(level > 0){
        //             res.append(ch);
        //         }
        //         level++;
        //     }
        //     else{
        //         level--;
        //         if(level > 0){
        //             res.append(ch);
        //         }
        //     }
        // }
        // return res.toString();


        Stack<Character> stk = new Stack<>();
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(!stk.isEmpty()){
                    res.append(ch);
                }
                stk.push(ch);
            }
            else{
                stk.pop();
                if(!stk.isEmpty()){
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}