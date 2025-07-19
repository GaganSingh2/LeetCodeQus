class Solution {
    private boolean isPrime(int i){
        int cnt = 0;
        for(int j=1; j<=Math.sqrt(i); j++){
            if(i%j==0){
                cnt++;
            }
        }
        if(cnt==1){
            return true;
        }
        else{
            return false;
        }
    }
    public long splitArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        // ArrayList<Integer> a = new ArrayList<>();
        // ArrayList<Integer> b = new ArrayList<>();
        long sum1 = 0, sum2 = 0;
        sum2 += nums[0];
        sum2 += nums[1];
        
        for(int i=2; i<nums.length; i++){
            if(isPrime(i)){
               sum1 += nums[i];
            }
            else{
                
                sum2 += nums[i];
            }
        }
        return Math.abs(sum1-sum2);
    }
}