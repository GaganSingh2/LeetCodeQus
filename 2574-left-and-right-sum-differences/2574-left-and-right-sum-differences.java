class Solution {
    public int[] leftRightDifference(int[] nums) {
        if(nums.length==1) return new int[]{0};

        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];

        int sum = 0;
        for(int i=0; i<leftSum.length; i++){
            leftSum[i] = sum;
            sum += nums[i];
        }
        sum = 0;
        for(int i=rightSum.length-1; i>=0; i--){
            rightSum[i] = sum;
            sum += nums[i];
        }

        for(int i=0; i<leftSum.length; i++){
            int diff = Math.abs(leftSum[i]-rightSum[i]);
            nums[i] = diff;
        }

        return nums;
    }
}