class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<=i; j++){
                maxVal = Math.max(maxVal, nums[j]);
            }

            for(int j=i; j<nums.length; j++){
                minVal = Math.min(minVal, nums[j]);
            }

            int currVal = maxVal - minVal;
            if(currVal <= k){
                return i;
            }
            minVal = Integer.MAX_VALUE;
            maxVal = Integer.MIN_VALUE;
        }
        return -1;
    }
}