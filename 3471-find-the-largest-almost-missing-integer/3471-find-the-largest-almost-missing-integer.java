class Solution {
    public int largestInteger(int[] nums, int k) {
        int freq[] = new int[51];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]-0]++;
        }
        if(k == 1){
            int maxEle = Integer.MIN_VALUE;
            for(int i=0; i<freq.length; i++){
                if(freq[i] == 1 && i > maxEle){
                    maxEle = i;
                }
            }
            return maxEle != Integer.MIN_VALUE ? maxEle: -1;
        }
        else if(k == nums.length){
            int maxEle = Integer.MIN_VALUE;
            for(int val: nums){
                maxEle = Math.max(val, maxEle);
            }
            return maxEle;
        }
        else{
            int maxEle = Integer.MIN_VALUE;
            if(freq[nums[0]]==1 && freq[nums[nums.length-1]]==1){
                return Math.max(nums[0], nums[nums.length-1]);
            }
            else if(freq[nums[0]]==1 && freq[nums[nums.length-1]]>1){
                return nums[0];
            }
            else if(freq[nums[0]]>1 && freq[nums[nums.length-1]]==1){
                return nums[nums.length-1];
            }
        }
        return -1;
    }
}