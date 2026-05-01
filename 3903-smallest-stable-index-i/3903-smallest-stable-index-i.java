class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        int res = -1;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<=i; j++){
                maxVal = Math.max(maxVal, nums[j]);
                // System.out.println("max"+maxVal);
            }
            for(int l=i; l<=nums.length-1; l++){
                minVal = Math.min(minVal,nums[l]);
                // System.out.println("min"+minVal);
            }
            int currRes = maxVal-minVal;
            // System.out.println("curr"+currRes);
            if(currRes<=k){
                return i;
                // System.out.println("res"+res);
            }
            maxVal = Integer.MIN_VALUE;
            minVal = Integer.MAX_VALUE;
        }
        return -1;
    }
}