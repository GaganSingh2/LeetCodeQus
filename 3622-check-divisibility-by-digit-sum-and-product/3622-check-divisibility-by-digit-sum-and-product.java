class Solution {
    public boolean checkDivisibility(int n) {
        int sumDigit = 0;
        int proDigit = 1;
        int val = n;
        while(val > 0){
            int currDigit = val % 10;
            sumDigit += currDigit;
            proDigit *= currDigit;
            val /= 10;
        }
        if(n % (sumDigit + proDigit) == 0){
            return true;
        }
        return false;
    }
}