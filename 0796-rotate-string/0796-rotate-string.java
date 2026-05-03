class Solution {
    public boolean rotateString(String s, String goal) {
        if((s.length() != goal.length()) || s.length()==0 || goal.length()>100){
            return false;
        }

        String newStr = s + s;
        if(newStr.contains(goal)){
            return true;
        }
        return false;
    }
}