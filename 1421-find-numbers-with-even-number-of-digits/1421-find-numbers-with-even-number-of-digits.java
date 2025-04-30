class Solution {
    public int findNumbers(int[] nums) {
        int evenNum = 0;
        for(int i=0; i<nums.length; i++){
            int digit = 0, val = nums[i];
            while(val > 0){
                int mod = val % 10;
                digit++;
                val /= 10;
            }
            if(digit % 2==0){
                evenNum++;
            }
        }
        return evenNum;
    }
}