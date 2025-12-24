class Solution {
    public int reverse(int val){
        int rev = 0;
        while(val>0){
            int digit = val%10;
            rev = rev * 10 + digit;
            val /= 10;
        }
        return rev;
    }
    public int mirrorDistance(int n) {
        if(n>=1 && n<=9){
            return 0;
        }
        return Math.abs(n - reverse(n));
    }
}