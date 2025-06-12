class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len = nums.length;
        int max_Diff = 0;
        max_Diff = Math.abs(nums[0]-nums[len-1]);

        for(int i=0; i<=len-1; i++){
            for(int j=i+1; j<len; j++){
                int val = Math.abs(nums[i]-nums[j]);
                max_Diff = Math.max(val,max_Diff);
                break;
            } 
        }
        return max_Diff;
    }
}

