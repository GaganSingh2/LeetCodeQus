class Solution {
    public boolean isPowerOfFour(int n) {
        //Using Bit-Manipulation---------
        if(n==1) return true;
        if(n<=0) return false;
        if((n & (n-2))==0 && (n%3==1)) return true;
        return false;

        //Using Iteration--------
        // long temp = 1;
        // while(temp<n){
        //     temp *= 4;
        //     if(temp == n){
        //         return true;
        //     }
        // }
        // return false;
    }
}