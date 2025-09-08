class Solution {
    private boolean isZero(int val){
        while(val>0){
            int digit = val % 10;
            if(digit==0 && val != 0){
                return false;
            }
            val /= 10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        
        for(int i=1; i<n; i++){
            int j = n-i;
            if(isZero(i) && isZero(j)){
                return new int[]{i,j};
            }
        }
        return new int[0];
    }
}