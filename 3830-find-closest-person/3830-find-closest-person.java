class Solution {
    public int findClosest(int x, int y, int z) {
        int fir = Math.abs(z-x);
        int sec = Math.abs(z-y);
        if(fir<sec){
            return 1;
        }
        else if(sec<fir){
            return 2;
        }
        else{
            return 0;
        }
        
    }
}