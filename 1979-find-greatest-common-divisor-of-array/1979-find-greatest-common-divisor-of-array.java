class Solution {
    public int findGCD(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<minVal){
                minVal = nums[i];
            }
            if(nums[i]>maxVal){
                maxVal = nums[i];
            }
        }

        int greatestCommanDivisior = 1;
        for(int i=1; i<=maxVal; i++){
            if((minVal % i == 0) && (maxVal % i == 0)){
                greatestCommanDivisior = i;
            }
        }
        return greatestCommanDivisior;
    }
}