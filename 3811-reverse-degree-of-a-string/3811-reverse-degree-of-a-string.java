class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = 'z'-ch;
            res += (i+1)*(idx+1);
        }
        return res;
    }
}