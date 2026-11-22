class Solution {
    public boolean checkString(String s) {
        //1st Apporach------------
        for(int i=0; i<=s.length()-2; i++){
            if(s.charAt(i) == 'b' && s.charAt(i+1)=='a'){
                return false;
            }
        }
        return true;

        //2nd Approach-------------
        // int idxA = -1, idxB = -1;
        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i) == 'a'){
        //         idxA = i;
        //     }
        //     else{
        //         idxB = i;
        //     }
        //     if(idxA > idxB && (idxA != -1 && idxB != -1)){
        //         return false;
        //     }
        // }
        // return true;
    }
}