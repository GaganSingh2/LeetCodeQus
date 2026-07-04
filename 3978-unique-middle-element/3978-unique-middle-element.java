class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int si = 0, ei = nums.length-1;
        int mid = si + (ei - si)/2;
        for(int i=0; i<nums.length; i++){
            if(nums[mid]==nums[i] && i != mid){
                return false;
            }
        }
        return true;
    }
}