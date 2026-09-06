class Solution {
    public int countGoodRotations(int[] nums) {
        long totalSum = 0;
        for(int val: nums){
            totalSum += val;
        }

        long firHalfSum = 0;
        for(int i=0; i<nums.length/2; i++){
            firHalfSum += nums[i];
        }

        int res = 0;
        for(int i=0; i<nums.length; i++){
            if(2 * firHalfSum > totalSum){
                res++;
            }

            firHalfSum -= nums[i];
            firHalfSum += nums[(i+nums.length/2)%nums.length];
        }
        return res;
    }
}
