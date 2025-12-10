class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for(int val: nums){
            sum += val;
            
        }
        if(sum % 2!=0){
            return 0;
        }
        int cntPartition = 0;
        int firSum = 0;
        int secSum = 0;
        for(int i=0; i<=nums.length-2; i++){
            firSum += nums[i];
            for(int j=i+1; j<nums.length; j++){
                secSum += nums[j];
            }
            if(Math.abs(firSum-secSum)%2==0){
                cntPartition++;
                secSum = 0;
            }
        }
        return cntPartition;
    }
}