class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i] == 1){
                count++;
            }else{
                max = Math.max(count,max);
                count = 0;
            }
        }
        max = Math.max(count,max);
        return max;
    }
}

