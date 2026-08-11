class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length == 1){
            return nums[0]+1;
        }
        HashSet<Integer> flag = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            flag.add(nums[i]);
        }

        //calculate sum of longest consecutive prefix
        int prefixSum = nums[0];
        for(int i=1; i<=nums.length-1; i++){
            if(nums[i] == (nums[i-1]+1)){
                prefixSum += nums[i];
            }
            else{
                if(!flag.contains(prefixSum)){
                    return prefixSum;
                }
                else{ //don't calculate sum further
                    break;
                }
            }
        }

        //find the smallest integer missing integer in nums array >= prefixSum
        while(flag.contains(prefixSum)){
            prefixSum++;
        }
        return prefixSum;
    }
}