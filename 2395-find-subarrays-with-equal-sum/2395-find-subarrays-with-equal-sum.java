class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i=1; i<=nums.length-1; i++){
            sum = nums[i]+nums[i-1];
            //if the sum is already present means this is the second time we got same sum so we found our result and return true
            if(set.contains(sum)){
                return true;
            }
            else{ //otherwise add in the set as 1st time found
                set.add(sum);
            }
        }
        //not found
        return false;
    }
}