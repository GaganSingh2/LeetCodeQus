class Solution {
    public long countCommas(long n) {
        if(n < 1000){
            return 0;
        }

        long totalCommas = 0, start = 1000, commas = 1;
        while(start <= n){
            long end = start * 1000 - 1;
            long count = Math.min(n, end) - start + 1;
            totalCommas += count * commas;
            start *= 1000;
            commas++;
        }

        return totalCommas;
    }
}