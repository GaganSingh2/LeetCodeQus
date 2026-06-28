class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum = 0;
        int i = nums.length-1;
        while(k > 0){
            if(mul > 0){
                sum += (long)mul * nums[i];
            }
            else{
                sum += nums[i];
            }
            k--;
            mul--;
            i--;
        }
        return sum;
    }
}