class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int ele: nums){
            if(ele<min){
                min = ele;
            }
            if(ele>max){
                max = ele;
            }
        }
        long val = max-min;
        return val*k;
    }
}