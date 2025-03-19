class Solution {
    public boolean search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;

        while(si<=ei){
            int mid = si+(ei-si)/2;

            //kaam
            if(nums[mid]==target){
                return true;
            }
            if (nums[mid] == nums[si]) {
                si++;
                continue;
            }
            //Mid on L1
            else if(nums[si]<=nums[mid]){
                //Case a: left
                if(nums[si]<=target && target<=nums[mid]){
                    ei = mid-1;
                }
                // //Case a: Right
                else{
                    si = mid+1;
                }
            }
            // Mid on L2
            else{
                //Case c: Right
                if(nums[mid]<=target && target<=nums[ei]){
                    si = mid+1;
                }
                //Case D: Left
                else{
                    ei = mid-1;
                }
            } 
        }
        return false;
    }
}