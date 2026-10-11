class Solution {
    public int sumOfSquares(int[] nums) {
        int res = 0;
        int cnt = 1;
        for(int i=0; i<nums.length; i++){
            if(nums.length % cnt == 0){
                // System.out.println(nums[i]);
                res += nums[i] * nums[i];
            }
            cnt++;
        }
        return res;
    }
}