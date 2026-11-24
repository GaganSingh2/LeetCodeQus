class Solution {
    public int countDominantElements(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
       
        int cntOfDominantEle = 0;
        for(int i=1; i<=nums.length-2; i++){
            int currSum = (nums[i-1] + nums[i+1]);
            double avg = currSum / 2.0;
            System.out.println(avg);
            if(nums[i] >= avg){
                cntOfDominantEle++;
            }
        }
        
        if(nums[0] >= nums[1]){
            cntOfDominantEle++;
        }
        if(nums[nums.length-1] >= nums[nums.length-2]){
            cntOfDominantEle++;
        }
        return cntOfDominantEle;
    }
}