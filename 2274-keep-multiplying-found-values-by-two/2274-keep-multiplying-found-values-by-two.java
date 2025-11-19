class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int finalResult = original;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==finalResult){
                finalResult *= 2;
            }
        }
        return finalResult;
    }
}
// 1 3 5 6 12