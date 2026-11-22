class Solution {
    public boolean checkString(String s) {
        int idxA = -1, idxB = -1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                idxA = i;
            }
            else{
                idxB = i;
            }
            if(idxA > idxB && (idxA != -1 && idxB != -1)){
                return false;
            }
        }
        return true;
    }
}