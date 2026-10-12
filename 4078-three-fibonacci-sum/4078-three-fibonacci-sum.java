class Solution {
    public boolean threeFibonacciSum(int n) {
        int fir = 0;
        int sec = 1;
        int trd = 1;
        while(trd<=n){
            if(fir + sec + trd == n){
                return true;
            }
            int next = sec + trd;
            fir = sec;
            sec = trd;
            trd = next;
        }
        return false;
    }
}