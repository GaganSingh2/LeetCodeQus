class Solution {
    public int divide(int dividend, int divisor) {
        int quotient  = dividend / divisor;

        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        

        return quotient;
    }
}
