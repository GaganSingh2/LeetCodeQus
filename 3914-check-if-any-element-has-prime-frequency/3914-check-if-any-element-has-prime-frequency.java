class Solution {
    private boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        int freq[] = new int[101];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;

        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]>0 && isPrime(freq[i])){
                return true;
            }
        }
        return false;
        
    }
}