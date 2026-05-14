class Solution {
    public boolean isGood(int[] nums) {
        int len = nums.length-1;
        HashSet<Integer> seen = new HashSet<>();
        boolean flag = false;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>len){
                return false;
            }
            else if(seen.contains(nums[i])){
                if(nums[i]<len || flag){
                    return false;
                }
                else{
                    flag = true;
                    continue;
                }
            }
            seen.add(nums[i]);
        }
        return flag;
    }
}