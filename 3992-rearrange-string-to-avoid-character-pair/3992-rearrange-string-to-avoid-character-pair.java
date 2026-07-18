class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder otherChar = new StringBuilder("");
        StringBuilder xChar = new StringBuilder(x);
        StringBuilder yChar = new StringBuilder(y);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == x){
                xChar.append(ch);
            }
            else if(ch == y){
                yChar.append(ch);
            }
            else{
                otherChar.append(ch);
            }
        }
        // System.out.println(xChar.toString()+" "+yChar.toString()+" "+otherChar);
        StringBuilder res = new StringBuilder("");
        res.append(yChar);
        res.append(otherChar);
        res.append(xChar);
        return res.toString();
    }
}