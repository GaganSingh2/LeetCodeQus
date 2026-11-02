class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length/2];

        long moves = 0;
        for(int val : nums){
            moves += Math.abs(val - median);
        }
        return (int)moves;
    }
}