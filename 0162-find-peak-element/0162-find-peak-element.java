class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if(len==1 || nums[0]>nums[1]){
            return 0;
        }
        if(nums[len-1]>nums[len-2]){
            return len-1;
        }

        int si = 1, ei = len-2;
        while(si<=ei){
            int mid = si + (ei-si)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
        }
        return 0;
    }
}