class Solution {
    public int peakValleyDifference(int[] nums) {
        int peakSum = 0, valleySum = 0;
        for(int i=1; i<=nums.length-2; i++){
            int val = nums[i];
            if(val > nums[i-1] && val > nums[i+1]){
                peakSum += val;
                // System.out.print(val+" ");
            }
            if(val < nums[i-1] && val < nums[i+1]){
                valleySum += val;
                // System.out.print(val+" ");
            }
        }
        return peakSum - valleySum;
    }
}