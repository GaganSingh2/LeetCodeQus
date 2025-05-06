class Solution {
    public int[] buildArray(int[] nums) {
        // int res[] = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     res[i] = nums[nums[i]];
        // }
        // return res;

        // SC=> O(1)
        for(int i=0; i<nums.length; i++){
            nums[i] += (1024 * (nums[nums[i]]%1024));
        }
        for(int i=0; i<nums.length; i++){
            nums[i] /= 1024;
        }
        return nums;
    }
}