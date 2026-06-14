class Solution {
    public long maxRatings(int[][] units) {
        long sum1 = 0, sum2 = 0;
        long firMin = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;

        for(int i[]: units){
            int fir  = Integer.MAX_VALUE;
            int sec = Integer.MAX_VALUE;
            for(int j: i){
                if(fir>j){
                    sec = fir;
                    fir = j;
                }
                else if(sec > j){
                    sec = j;
                }
            }
            if(i.length==1){
                sec = 0;
            }
            sum1 += fir;
            sum2 += sec;
            firMin = Math.min(firMin, fir);
            secMin = Math.min(secMin, sec);
        }
        long temp = firMin + sum2 - secMin;
        return Math.max(sum1, temp); 
    }
}