class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        //Using Bit-Manipulation
        // if(n<=0) return false;
        // if((n & (n-1))==0){
        //     return true;
        // }
        // return false;

        //Using Loop
        long temp = 1;
        while(temp<n){
            temp *= 2;
            if(temp==n){
                return true;
            }
        }
        return false;
    }
}