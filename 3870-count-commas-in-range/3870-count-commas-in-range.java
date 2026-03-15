class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }

        int totalComma = 0, start = 1000, commas = 1;
        while(start<=n){
            int end = start * 1000 -1;
            int count = Math.min(n,end)-start +1;
            totalComma += count * commas;
            start *= 1000;
            commas++; 
        }
        return totalComma;
    }
}

// 1000(999) to 9999 → 9000 numbers → each has 1 comma

// 10000(9999) → 12000 → 2001 numbers → each has 1 comma

// Total commas:

// (9000 × 1) + (2001 × 1) = 11001