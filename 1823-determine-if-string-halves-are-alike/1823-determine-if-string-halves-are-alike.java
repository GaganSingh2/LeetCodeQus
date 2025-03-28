class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length()/2;
        int si =0;
        int ei = s.length()-1;
        int leftCount = 0;
        int rightCount = 0;
        while(si<len || ei>len){
            char leftCh = s.charAt(si);
            char rightCh = s.charAt(ei);
            if(leftCh=='a' || leftCh=='e' || leftCh=='i' || leftCh=='o' || leftCh=='u' || leftCh=='A' || leftCh=='E'
                || leftCh=='I' || leftCh=='O' || leftCh=='U'){
                    leftCount++;
            }
            if(rightCh=='a' || rightCh=='e' || rightCh=='i' || rightCh =='o' || rightCh=='u' || rightCh=='A' || rightCh=='E'
                || rightCh=='I' || rightCh=='O' || rightCh=='U'){
                    rightCount++;
            }
            si++;
            ei--;
        }
        if(leftCount == rightCount){
            return true;
        }else{
            return false;
        }
    }
}