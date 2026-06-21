class Solution {
    private boolean checkDigit(long n, int x){
        if(n<=9){
            if(n == x){
                return true;
            }
        }
        long lastDigit = n % 10;
        if(lastDigit != x){
            return false;
        }
        while(n>0){
            long digit = n % 10;
            lastDigit = digit;
            n /= 10;
        }
        if(lastDigit == x){
            return true;
        }
        return false;
    }
    public int countValidSubarrays(int[] nums, int x) {
        long sum = 0, totalCnt = 0;
        for(int i=0; i<nums.length; i++){
            sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(checkDigit(sum, x)){
                    totalCnt++;
                }
                
            }
        }
        return (int)totalCnt;
    }
}