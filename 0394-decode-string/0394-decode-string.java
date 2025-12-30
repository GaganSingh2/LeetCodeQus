class Solution {
    public String decodeString(String s) {
        //1st Step: Create 2 variable as well as 2 stack for string and number
        String currStr = "";
        int currNum = 0;
        Stack<String> str = new Stack<>();
        Stack<Integer> num = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            //if ch==digit then store into currNum
            if(Character.isDigit(ch)){
                currNum = currNum * 10 + (ch-'0');
            }

            //2nd Step: if ch=='[' then push both currNum and currString into stack and reset both variable
            else if(ch=='['){
                str.push(currStr);
                num.push(currNum);
                currStr = "";
                currNum = 0;
            }

            //3rd Step: if ch==letter then assign into currStr
            else if(ch>='a' && ch<='z'){
                currStr += ch;
            }

            //4th Step: if ch==']' then pop both stack
            else if(ch==']'){
                int count = num.pop();
                String prevStr = str.pop();
                //repeat currStr in count times
                String tmp = currStr;
                for(int j=1; j<count; j++){
                    currStr += tmp;
                }
                //append the currStr into prevStr
                prevStr += currStr;
                //append the prevStr into currStr
                currStr = "";
                currStr = prevStr;
                prevStr = "";
            }
        }
        return currStr;
    }
}