class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len = nums.length;
        int max_Diff = 0;
        max_Diff = Math.abs(nums[0]-nums[len-1]);
         
        //  1st Way---------------
        // for(int i=0; i<=len-1; i++){
        //     for(int j=i+1; j<len; j++){
        //         int val = Math.abs(nums[i]-nums[j]);
        //         max_Diff = Math.max(val,max_Diff);
        //         break;
        //     } 
        // }

        // 2nd Way---------
        for(int i=0; i<len-1; i++){
            int val = Math.abs(nums[i]-nums[i+1]);
            max_Diff = Math.max(val, max_Diff);
        }
        return max_Diff;
    }
}

