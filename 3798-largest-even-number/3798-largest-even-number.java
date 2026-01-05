class Solution {
    public String largestEven(String s) {
        if(s.charAt(s.length()-1)=='2'){
            return s;
        }
        StringBuilder sb = new StringBuilder("");
        int idx = -1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='2'){
                idx = i;
            }
        }
        for(int i=0; i<=idx; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
       
    }
}