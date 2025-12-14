class Solution {
    public int absDifference(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int si = 0, ei = nums.length-1;
        int fir = 0, last = 0;
        while(si<=k-1){
            fir += nums[si++];
            last += nums[ei--];
        }
        return Math.abs(fir-last);
    }
}