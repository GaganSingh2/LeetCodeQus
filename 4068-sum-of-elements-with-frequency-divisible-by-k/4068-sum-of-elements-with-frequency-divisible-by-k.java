class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        if(nums.length==1){
            if(1%k==0){
                return nums[0];
            }
        }
        Arrays.sort(nums);
        int sum = 0;
        int freq = 1;
        for(int i=1; i<=nums.length-1; i++){
            if(nums[i-1]==nums[i]){
                freq++;
            }
            else{
                if(freq % k == 0){
                    sum += freq * nums[i-1];
                }
                freq = 1;
            }
        }
        if(freq%k==0){
            sum += freq * nums[nums.length-1]; 
        }
        return sum;
    }
}