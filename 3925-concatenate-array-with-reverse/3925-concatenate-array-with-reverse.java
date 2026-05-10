class Solution {
    public int[] concatWithReverse(int[] nums) {
        int res[] = new int[nums.length * 2];
        for(int i=0; i<nums.length; i++){
            res[i] = nums[i];
        }
        int si = nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            res[++si] = nums[i];
        }
        return res;
    }
}