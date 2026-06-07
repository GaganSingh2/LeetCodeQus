class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sumOfCompatible = 0;
        int max = Math.max(1, n+k);
        for(int x=1; x<=max; x++){
            int diff = Math.abs(n-x);
            if((diff <= k) && ((n & x)==0)){
                sumOfCompatible += x;
            }
        }

        return sumOfCompatible;
    }
}