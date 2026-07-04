class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        // int maxL = nums[0];
        // int ans = Integer.MIN_VALUE;
        
        // for(int i=k; i<nums.length; i++){
        //     maxL = Math.max(maxL, nums[i-k]);
        //     ans = Math.max(ans, maxL + nums[i]);
        // }
        
        // return ans;


        int maxArray[] = new int[nums.length];
        int max = -1;
        for(int i=nums.length-1; i>=0; i--){
            max = Math.max(nums[i], max);
            maxArray[i] = max;
        }

        max = -1;
        for(int i=0; i<nums.length; i++){
            if(i+k < nums.length){
                max = Math.max(nums[i]+maxArray[i+k], max);
            }
        }
        return max;
    }
}