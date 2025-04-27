class Solution {
    public int countSubarrays(int[] nums) {
        int countSub = 0;
        for(int i=2; i<nums.length; i++){
            int si = i-2, ei = i, mid = i-1;
            
            if((2*(nums[si]+nums[ei]))==(nums[mid])){
                countSub++;
            }
        }
        
        return countSub;
    }
}