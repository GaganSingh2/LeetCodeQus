class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder("");
        int idx = -1;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='u' || s.charAt(i)=='o'){
                 idx = i;
                
            }
            else{
               break;
            }
        }
        if(idx==-1) return s;
        for(int i=0; i<idx; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}