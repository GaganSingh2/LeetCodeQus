class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long totalComma = 0;
        long start = 1000; //bcz after 999 comma using
        long commas = 1;
        while(start<=n){
            long end = start * 1000-1;
            long count = Math.min(n,end)-start + 1;
            totalComma += count*commas;
            start *= 1000;
            commas++;
        }
        return totalComma;
    }
}