class Solution {
    public boolean check(int[] nums) {
        int rotate = 0;
        int len = nums.length;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>=nums[i-1]){
                continue;
            }
            else{
                rotate++;
            }
        }
        if(nums[len-1]<=nums[0]){

        }else{
            rotate++;
        }
        
        if(rotate>1){
            return false;
        }
        else{
            return true;
        }
    }
}