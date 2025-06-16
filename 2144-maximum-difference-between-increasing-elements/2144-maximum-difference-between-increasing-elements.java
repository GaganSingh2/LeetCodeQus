class Solution {
    public int maximumDifference(int[] nums) {
        int max_Diff = Integer.MIN_VALUE;
        int temp = 0;
        for(int i=0; i<=nums.length-1; i++){
            
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    temp = nums[j]-nums[i];
                    max_Diff = Math.max(temp,max_Diff);
                }
                
            }
            
        }
        if(max_Diff < 0){
            return -1;
        }
        return max_Diff;
    }
    
}
