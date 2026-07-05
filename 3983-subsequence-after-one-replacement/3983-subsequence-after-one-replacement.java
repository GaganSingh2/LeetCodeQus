class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        if(s.length() > t.length()){
            return false;
        }
        int noRepl = 0;
        int oneRepl = 0;
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            int prevNo = noRepl;
            int prevOne = oneRepl;

            if(prevNo < s.length() && s.charAt(prevNo)==ch){
                noRepl = prevNo + 1;
            }

            int nextOne = prevOne;
            if(prevOne < s.length() && s.charAt(prevOne)==ch){
                nextOne = prevOne + 1;
            }
            if(prevNo < s.length()){
                nextOne = Math.max(nextOne, prevNo+1);
            }
            oneRepl = nextOne;
        }
        return noRepl == s.length() || oneRepl == s.length();
    }
}