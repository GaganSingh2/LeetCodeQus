class Solution {
    public int digitFrequencyScore(int n) {
        int totalSum = 0;
        while(n>0){
            int digit = n % 10;
            totalSum += digit;
            n /= 10;
        }
        return totalSum;
    }
}