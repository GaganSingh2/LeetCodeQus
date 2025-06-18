class Solution {
    public int findGCD(int[] nums) {
        int greatest = Integer.MIN_VALUE, small = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<small){
                small = nums[i];
            }
            if(nums[i]>greatest){
                greatest = nums[i];
            }
        }
        int greatestComDiv = 0;
        for(int i=1; i<=greatest; i++){
            if((greatest % i == 0) && (small % i==0)){
                greatestComDiv = i;
            }
        }
        return greatestComDiv;
    }
}