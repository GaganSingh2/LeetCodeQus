class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0; 
        for(int i=0; i<nums.length; i++){
            sum += nums[i]; //1+2=3+3=6
            nums[i] = sum; 
        }
        return nums;
    }
}