class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        //1st Approach (Brute Force) TC:O(n^2)---------------
        // int minLen = Integer.MAX_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     int currSum = 0;
        //     for(int j=i; j<nums.length; j++){
        //         currSum += nums[j];
        //         if(currSum >= target){
        //             minLen = Math.min(minLen, j-i+1);
        //             break;
        //         }
        //     }
        // }
        // return minLen != Integer.MAX_VALUE ? minLen : 0;

        //2nd Approach (Sliding WIndow) TC:O(n)-------------------
        int minLen = Integer.MAX_VALUE;
        int currSum = 0;
        int left = 0;
        for(int right=0; right<nums.length; right++){
            currSum += nums[right];
            while(currSum >= target){
                minLen = Math.min(minLen, right-left+1);
                currSum -= nums[left];
                left++;
            }

        }
        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
}