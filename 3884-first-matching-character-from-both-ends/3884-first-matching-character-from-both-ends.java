class Solution {
    public int firstMatchingIndex(String s) {
        if(s.length()==1) return 0;
        int si = 0, n = s.length();
        while(si<n-1){
            if(s.charAt(si)==s.charAt(n-si-1)){
                return si;
            }
            else{
                si++;
            }
        }
        return -1;
    }
}