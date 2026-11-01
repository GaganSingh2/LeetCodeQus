class Solution {
    public int minMergedInteger(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-1; i+=2){
            String val1 = String.valueOf(nums[i]);
            String val2 = String.valueOf(nums[i+1]);
            int mergeVal = Integer.parseInt(val1 + val2);
            minVal = Math.min(minVal, mergeVal);
        }

        return minVal;
    }
}