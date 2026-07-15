class Solution {
    private int gcd(int evenSum, int oddSum){
        if(oddSum == 0){
            return evenSum;
        }
        return gcd(oddSum, evenSum%oddSum);
    }
    public int gcdOfOddEvenSums(int n) {
        int evenSum = n * (n+1);
        int oddSum = n*n;
        
        return gcd(evenSum, oddSum);
    }
}
