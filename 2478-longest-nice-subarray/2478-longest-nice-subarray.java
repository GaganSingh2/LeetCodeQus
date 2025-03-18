class Solution {
    
    public int longestNiceSubarray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        
        int count = 0;
        int bit = 0;
        int maxCnt = Integer.MIN_VALUE;
        int j = 0;
        for(int i=0; i<=nums.length-1; i++){
            
            while(j<i && (bit & nums[i]) != 0){
                
                bit ^= nums[j];
                
                j++;
            }
            bit |= nums[i];
            maxCnt = Math.max(maxCnt,i-j+1);
        }
        // System.out.println(maxCnt);
        
        return maxCnt;
    }
}