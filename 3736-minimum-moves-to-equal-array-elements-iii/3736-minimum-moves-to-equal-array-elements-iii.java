class Solution {
    public int minMoves(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            maxVal = Math.max(nums[i],maxVal);
        }
        int res = 0;
        for(int i=0; i<nums.length; i++){
            res += maxVal-nums[i];
        }
        return res;
    }
}