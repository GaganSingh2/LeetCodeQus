class Solution {
    public int minimumSwaps(int[] nums) {
        int swaps = 0;
        int nonZeroCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){ //Count total non-zero elements.
                nonZeroCount++; 
            }
        }

        //then check how many zero present in first nonZeroCount position in array
        for(int i=0; i<nonZeroCount; i++){
            if(nums[i]==0){
                swaps++;//these many swaps are used to moves all the zero to end
            }
        }
        return swaps;
    }
}