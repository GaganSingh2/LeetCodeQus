class Solution {
    public int minDeletions(int[] nums) {
        int res = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i]){
                res++;
            }
        }
        return res;
    }
}