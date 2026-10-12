class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        //1st Approach TC:O(n^2), SC:O(1)---------
        int maxProduct = Integer.MIN_VALUE;
        int res[] = {-1,-1};
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if((nums[i] + nums[j] == target && nums[i] > nums[j]) && i != j){
                    if(maxProduct < (nums[i] * nums[j])){
                        maxProduct = nums[i] * nums[j];
                        res[0] = i;
                        res[1] = j;
                    }
                }
            }
        }
        return res;
    }
}