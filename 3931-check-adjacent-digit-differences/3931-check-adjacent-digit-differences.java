class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0; i<=s.length()-2; i++){
            int a = s.charAt(i)-'0';
            int b = s.charAt(i+1)-'0';
            int diff = Math.abs(a-b);
            if(diff>2){
                return false;
            }
        }
        return true;
    }
}