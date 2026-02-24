class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i=1; i<=nums.length-1; i++){
            sum = nums[i]+nums[i-1];
            if(set.contains(sum)){
                return true;
            }
            else{
                set.add(sum);
            }
        }
        return false;
    }
}