class Solution {
    public int maximumCount(int[] nums) {
        int maxNeg = 0;
        int maxPos = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                maxNeg++;
            }else if(nums[i]>=1){
                maxPos++;
            }
        }
        return Math.max(maxPos,maxNeg);
    }
}