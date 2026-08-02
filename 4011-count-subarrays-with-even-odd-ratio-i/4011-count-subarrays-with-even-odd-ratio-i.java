class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int totalValid = 0;
        for(int i=0; i<nums.length; i++){
            int evenCnt = 0, oddCnt = 0;
            for(int j=i; j<nums.length; j++){
                if(nums[j] % 2 == 0){
                    evenCnt++;
                }
                else{
                    oddCnt++;
                }

                if(evenCnt * b <= oddCnt * a){
                    totalValid++;
                }
            }
        }
        return totalValid;
    }
}