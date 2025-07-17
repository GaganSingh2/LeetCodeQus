class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1) return true;

        boolean monotoneInc = true;
        boolean monotoneDec = true;
        
        for(int i=1; i<nums.length; i++){
           if(nums[i-1]>nums[i]) monotoneInc = false;
           if(nums[i-1]<nums[i]) monotoneDec = false;
           if(monotoneInc==false && monotoneDec==false) return false;
        }
       
        return monotoneInc || monotoneDec;
    }
}