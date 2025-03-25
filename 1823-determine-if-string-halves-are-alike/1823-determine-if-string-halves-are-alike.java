class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length()/2;
        int si =0;
        int ei = s.length()-1;
        int chCount = 0;
        int laCount = 0;
        while(si<len || ei>len){
            char ch = s.charAt(si);
            char la = s.charAt(ei);
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' ||ch=='A' || ch=='E'
                || ch=='I' || ch=='O' || ch=='U'){
                    chCount++;
            }
            if(la=='a' || la=='e' || la=='i' || la =='o' || la=='u' || la=='A' || la=='E'
                || la=='I' || la=='O' || la=='U'){
                    laCount++;
            }
            si++;
            ei--;
        }
        if(chCount == laCount){
            return true;
        }else{
            return false;
        }
    }
}