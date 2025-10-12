class Solution {
    public boolean scoreBalance(String s) {
        int total = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            total +=  ch-'a'+1;
        }
        int left = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            left += ch - 'a'+1;
            if(left == total-left){
                return true;
            }
        }
        return false;
    }
}