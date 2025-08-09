class Solution {
    public boolean isPowerOfTwo(int n) {
        //return ((n & (n-1))==0;
        if(n<=0){
            return false;
        }
        boolean res = false;
        
        if((n & (n-1))==0){
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
}