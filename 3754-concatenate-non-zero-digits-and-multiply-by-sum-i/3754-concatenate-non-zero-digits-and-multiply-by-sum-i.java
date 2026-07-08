class Solution {
    public long sumAndMultiply(int n) {
        long nonZeroDigit = 0, mul = 1;
        long totalSum = 0;
        while(n>0){
            int digit = n % 10;
            totalSum += digit;
            if(digit != 0){
                nonZeroDigit =  nonZeroDigit + digit * mul;
                mul *= 10;
            }
            n /= 10;
        }

        return nonZeroDigit * totalSum;
    }
}