class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1){
            return 1;
        }

        int inc_len = 1, dec_len = 1, max_len = 0;
        for(int i=1; i<=nums.length-1; i++){
            if(nums[i] > nums[i-1]){
                inc_len++;
                dec_len = 1;
            }
            else if(nums[i] < nums[i-1]){
                dec_len++;
                inc_len = 1;
            }
            else{
                inc_len = 1;
                dec_len = 1;
            }
            max_len = Math.max(max_len, Math.max(inc_len, dec_len));
        }
        return max_len;
    }
}