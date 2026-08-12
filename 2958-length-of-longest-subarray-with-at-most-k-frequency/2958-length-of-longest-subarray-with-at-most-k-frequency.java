class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        if(nums.length == 1){
            return 1;
        }
        int maxLength = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        int si = 0;
        
        for(int ei=0; ei<nums.length; ei++){
            freq.put(nums[ei], freq.getOrDefault(nums[ei], 0)+1);

            // System.out.println(freq.get(nums[i]));
            while(freq.get(nums[ei])>k){
                freq.put(nums[si], freq.get(nums[si])-1);
                si++;
            }
            maxLength= Math.max(maxLength, ei - si + 1);

        }
        
        return maxLength;
    }
}