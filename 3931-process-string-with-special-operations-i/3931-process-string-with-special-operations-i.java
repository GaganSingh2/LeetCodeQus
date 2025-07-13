class Solution {
    // private void reverse(StringBuilder res){
    //     int si = 0, ei = res.lenght()-1;
    //     while(si<ei){
    //         char temp = res.charAt(si);
    //         res.charAt(si) = res.charAt(ei);
    //         res.charAt(ei) = temp;
    //         si++;
            
    //     }
    // }
    public String processStr(String s) {
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '*'){
                if(res.length()>=1){
                    res.deleteCharAt(res.length()-1);
                }
            }
            else if(ch == '#'){
                res.append(res);
            }
            else if(ch == '%'){
                res.reverse();
            }
            else{
                
                res.append(ch);
                // System.out.println(res);
            
            }
        }
        return res.toString();
    }
}