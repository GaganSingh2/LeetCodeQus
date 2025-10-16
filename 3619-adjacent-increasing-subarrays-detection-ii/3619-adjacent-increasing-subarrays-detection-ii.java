class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int maxLen = 0, inc = 1, prevInc = 0;
        int len = nums.size();
        for(int i=1; i<len; i++){
            if(nums.get(i)>nums.get(i-1)){
                inc++;
            }
            else{
                prevInc = inc;
                inc = 1;
            }
            maxLen = Math.max(maxLen,Math.max(inc>>1, Math.min(prevInc,inc)));
            
        }
        return maxLen;
    }
}