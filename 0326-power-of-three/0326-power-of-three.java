class Solution {
    public boolean isPowerOfThree(int n) {

        //Mathematical Approach------
        // if(n<=0){
        //     return false;
        // }
        // int maxPowerOfThree = 1162261467; // 3^19, the largest power of 3 within the int range
        // // System.out.println(1162261467 / n);
        // return maxPowerOfThree % n == 0;

        //Iteration Approach
        if(n==1) return true;
        long temp = 1;
        while(temp<n){
            temp *= 3;
            if(temp==n) return true;
        }
        return false;
    }
}