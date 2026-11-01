class Solution {
    public int minMoves(int[] nums) {
        //Approach -1st
        int minVal = Integer.MAX_VALUE, moves = 0;
        for(int val: nums){
            minVal = Math.min(val, minVal);
        }

        for(int val: nums){
            moves += val - minVal; 
        }
        return moves;

        //Approach -2nd
        // int sum = 0, min = Integer.MAX_VALUE;
        // for(int val: nums){
        //     sum += val;
        //     min = Math.min(val, min);
        // }

        // return sum - nums.length * min;
    }
}