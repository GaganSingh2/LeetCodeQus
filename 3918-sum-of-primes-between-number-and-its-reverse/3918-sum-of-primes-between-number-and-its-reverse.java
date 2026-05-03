class Solution {
    public boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int sumOfPrime = 0;
        int reverseN = 0, tmp = n;
        while(n>0){
            int digit = n % 10;
            reverseN = digit + reverseN * 10;
            n /= 10;
        }
        // System.out.println(reverseN);
        int min = Math.min(tmp,reverseN), max = Math.max(tmp,reverseN);
        for(int i=min; i<=max; i++){
            if(isPrime(i)){
                sumOfPrime += i;
            }
        }
        return sumOfPrime;
    }
}