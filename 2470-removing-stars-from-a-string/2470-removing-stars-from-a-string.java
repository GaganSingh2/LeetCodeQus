class Solution {
    
    public String removeStars(String s) {
        Stack<Character> temp = new Stack<>();
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            temp.add(s.charAt(i));
        }
        int cnt =0;
        while(!temp.isEmpty()){
            char ch = temp.peek();
            if(ch=='*'){
                cnt++;
                temp.pop();
            }
           else if(cnt>0){
                temp.pop();
                cnt--;
            }
            else{
                
                res.append(ch);
                temp.pop();
            }
        }
        res.reverse();
        return res.toString();
    }
}