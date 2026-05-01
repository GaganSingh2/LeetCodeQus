class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len = nums.length;
        int suffixMin[] = new int[len];
        int prefixMax[] = new int[len];
        prefixMax[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefixMax[i] = Math.max(prefixMax[i-1],nums[i]);
        }

        suffixMin[len-1] = nums[len-1];
        for(int i=len-2; i>=0; i--){
            suffixMin[i] = Math.min(suffixMin[i+1],nums[i]);
        }

        for(int i=0; i<len; i++){
            int currVal = prefixMax[i]-suffixMin[i];
            if(currVal<=k){
                return i;
            }
        }
        return -1;
    }
}