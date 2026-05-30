class Solution {
    private int sum(int num){
        int ans = 0;
        while(num>0){
            int digit = num % 10;
            ans += digit;
            num /= 10;
        }
        return ans;
    }
    public int minElement(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int temp = sum(nums[i]);
            minVal = Math.min(temp, minVal);
        }
        return minVal;
    }
}