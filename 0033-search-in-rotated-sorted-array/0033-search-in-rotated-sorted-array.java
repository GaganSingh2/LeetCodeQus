class Solution {
    public int search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;
        while(si<=ei){
            int mid = si + (ei-si)/2;

            if(target == nums[mid]){
                return mid;
            }
            // Mid on L1
            else if(nums[si]<=nums[mid]){
                // Case a: Target in Left part
                if(nums[si]<=target && target <=nums[mid]){
                    ei = mid-1;
                }
                // Case b: Target in Right part
                else{
                    si = mid + 1;
                }
            }
            // Mid on L2
            else{
                // Case c: Target in Right part
                if(nums[mid]<=target && target<=nums[ei]){
                    si = mid + 1;
                }
                // Case d: Target in Left part
                else{
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }
}