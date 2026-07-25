class Solution {
    public int maxProduct(int n) {
        int maxProduct = 0;
        int count = 0;
        int firstMax = Integer.MIN_VALUE;
        int secMax = firstMax;
        while(n>0){
            int digit = n % 10;
            if(firstMax < digit){
                secMax = firstMax;
                firstMax = digit;
            }
            else if(secMax <= digit ){
                secMax = digit;
            }
            n /= 10;

        }
        maxProduct = firstMax * secMax;
        
        
        return maxProduct;
    }
}