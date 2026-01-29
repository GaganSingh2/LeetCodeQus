class Solution {
    public int findMin(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        int si = 0, ei = nums.length-1;
        while(si<ei){
            // int val = Integer.MAX_VALUE;
            int mid = si + (ei-si)/2;
            
                // val = nums[mid];
                // minVal = Math.min(val,minVal);
            
            if(nums[ei]<nums[mid]){
                // val = nums[si];
                // minVal = Math.min(val,minVal);
                si = mid+1;
            }
            else{
                //  val = nums[mid];
                 
                ei = mid;
            }
            // minVal = Math.min(val,minVal);
        }
        return nums[si];
    }
}