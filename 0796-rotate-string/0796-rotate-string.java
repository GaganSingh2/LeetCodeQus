class Solution {
    public boolean rotateString(String s, String goal) {
        if((s.length() != goal.length()) || s.length()==0 || goal.length()>100){
            return false;
        }

        // String newStr = s + s;
        // if(newStr.contains(goal)){
        //     return true;
        // }
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            if(sb.toString().equals(goal)){
                return true;
            }
            char tmp = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(tmp);
        }
        return false;
    }
}