class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxL = nums[0];
        int ans = Integer.MIN_VALUE;
        
        for(int i=k; i<nums.length; i++){
            maxL = Math.max(maxL, nums[i-k]);
            ans = Math.max(ans, maxL + nums[i]);
        }
        
        return ans;
    }
}