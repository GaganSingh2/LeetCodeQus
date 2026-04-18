class Solution {
    public boolean isPrime(int val){
        if(val<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(val); i++){
            if(val % i==0){
                return false;
            }
        }
        return true;
    }

    public int minOperations(int[] nums) {
        int totalOpt = 0;
        
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                while(!isPrime(nums[i])){
                    nums[i]++;
                    totalOpt++;
                    // System.out.println("Loop prime"+totalOpt);
                }
                
            }
            else{
                while(isPrime(nums[i])){
                    nums[i]++;
                    totalOpt++;
                    // System.out.println("Loop notprime"+totalOpt);
                }
            }
        }
        return totalOpt;
    }
}