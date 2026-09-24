class Solution {
    public int smallestIndex(int[] nums) {
        int idx = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            int sum = 0;
            while(val > 0){
                int digit = val % 10;
                sum += digit;
                val /= 10;
            }
            if(sum == i){
                idx = Math.min(idx, i);
            }
        }
        return idx == Integer.MAX_VALUE ? -1 : idx;
    }
}