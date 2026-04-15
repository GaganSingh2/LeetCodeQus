class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            int currNum = nums[i];
            while(currNum>0){
                int currDigit = currNum % 10;
                if(currDigit==digit){
                    cnt++;
                }
                currNum /= 10;
            }
        }
        return cnt;
    }
}