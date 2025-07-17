class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ch += 32;
                sb.append(ch);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}