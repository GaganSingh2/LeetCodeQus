class Solution {
    public boolean checkDivisibility(int n) {
        int digSum = 0, digPro = 1;
        int val  = n;
        while(val>0){
            int dig = val%10;
            digSum += dig;
            digPro *= dig;
            val /= 10;
        }
        if(n % (digSum+digPro)==0){
            return true;
        }
        return false;
    }
}