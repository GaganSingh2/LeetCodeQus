class Solution {
    public int minMoves(int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE;
        for(int val: nums){
            sum += val;
            min = Math.min(val, min);
        }

        return sum - nums.length * min;
    }
}