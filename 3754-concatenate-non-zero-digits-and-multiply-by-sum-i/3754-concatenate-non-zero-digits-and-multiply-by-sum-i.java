class Solution {
    public long sumAndMultiply(int n) {
        long nonZero = 0, sum=0, mul=1;
        while(n>0){
            int digit = n % 10;
            sum += digit;
            if(digit != 0){
                nonZero = nonZero + digit * mul;
                mul *= 10;
            }
            n /= 10;
        }
        return nonZero * sum;
    }
}