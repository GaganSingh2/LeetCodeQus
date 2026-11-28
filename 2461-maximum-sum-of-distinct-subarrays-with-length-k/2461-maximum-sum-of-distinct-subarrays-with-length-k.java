class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        if(k > nums.length){
            return 0;
        }
        long maxSum = 0;
        int left = 0, right = 0;
        long currSum = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        int duplicateVal = 0;
        for(right=0; right<k; right++){
            if(freq.containsKey(nums[right])){
                
                duplicateVal++;
            }
            freq.put(nums[right], freq.getOrDefault(nums[right], 0)+1);
            currSum += nums[right];
        }
        if(duplicateVal < 1){
            maxSum = Math.max(currSum, maxSum);
        }
        
        while(right<nums.length){
            if(freq.get(nums[left]) == 1){
                freq.remove(nums[left]);
            }
            else if(freq.get(nums[left])>1){
                freq.put(nums[left], freq.get(nums[left])-1);
                duplicateVal--;
            }
            currSum -= nums[left];
            currSum += nums[right];

            if(!freq.containsKey(nums[right])){
                if(duplicateVal < 1){
                    maxSum = Math.max(maxSum, currSum);
                   
                }
            }
            else if(freq.get(nums[right])>=1){
                duplicateVal++;
            }
            freq.put(nums[right], freq.getOrDefault(nums[right], 0)+1);
            left++;
            right++;
        }
        return maxSum;
    }
}