class Solution {
    public int compareBitonicSums(int[] nums) {
        int peakVal = Integer.MIN_VALUE, idx = -1;
        for(int i=0; i<nums.length; i++){
            if(peakVal<nums[i]){
                peakVal = nums[i];
                idx = i;
            }
        }
        long sumAsc = 0, sumDes = 0;
        for(int i=0; i<=idx; i++){
            sumAsc += nums[i];
        }
        for(int i=idx; i<nums.length; i++){
            sumDes += nums[i];
        }
        if(sumAsc > sumDes) return 0;
        else if(sumAsc<sumDes) return 1;
        return -1;
    }
}