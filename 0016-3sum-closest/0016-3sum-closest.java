class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int totalSum = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int si = i+1, ei = nums.length-1;
            while(si<ei){
                int currSum = nums[i]+nums[si]+nums[ei];
                // System.out.println(Math.abs(target-currSum)+" "+Math.abs(target-totalSum));
                if(currSum==target){
                    return currSum;
                }
                if(Math.abs(target-currSum)<Math.abs(target-totalSum)){
                    totalSum = currSum;
                    
                }
                else if(currSum<target){
                    si++;
                }
                else{
                    ei--;
                }
            }
        }
        return totalSum;
    }
}
// -4,-1,1,2
//Sort the array
// int result = nums[0]+nums[1]+nums[2] of nums
// fix the first element using i, and apply 2 pointer
//si = i+1, ei = len-1
// at each iteration calculate sum of nums[i]+nums[si]+nums[ei]
//if this sum is closer to the target means this is current best result, update them (Math.abs(target-sum)<Math.abs(target-result))
//if sum is target then return immediatley
//if sum is more than target then si++
//otherwise ei--