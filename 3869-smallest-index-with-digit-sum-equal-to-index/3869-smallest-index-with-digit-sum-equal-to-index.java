class Solution {
    public int smallestIndex(int[] nums) {
        int idx = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            int sum = 0;
            while(val>0){
                int va = val%10;
                sum += va;
                val /= 10;
            }
            System.out.println(sum);
            if(i == sum){
                idx = Math.min(idx,i);
            }
        }
        if(idx>nums.length) idx = -1;
        return idx;
    }
}