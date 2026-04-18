class Solution {
    public int reverseNum(int num){
        int rev = 0;
        while(num>0){
            int digit = num%10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
    public int mirrorDistance(int n) {
        if(n>=1 && n<=9){
            return 0;
        }
        int mirrorNum = reverseNum(n);
        return Math.abs(n-mirrorNum);
    }
}