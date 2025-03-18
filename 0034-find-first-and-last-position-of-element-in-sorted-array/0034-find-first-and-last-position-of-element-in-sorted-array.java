class Solution {
    public int[] searchRange(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;
         int res[] = {-1,-1};
         if(nums.length == 1){
            if(nums[0] == target){
                return new int[]{0,0};
            }
            return new int[]{-1,-1};
         }
         
        while(si<=ei){
            
            if(nums[si]!=target){
                si++;
            }
            if(nums[ei]!=target){
                ei--;
            }
            if(nums[si] == target && nums[ei] == target){
                res[0] = si;
                res[1] = ei;
                break;
            }
        }        
        return res;
    }
}