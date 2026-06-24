class Solution {
    public int findDuplicate(int[] nums) {















        //2nd Approach using HashSet TC:O(n) & SC:O(n)
        HashSet<Integer> freq = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(freq.contains(nums[i])){
                return nums[i];
            }
            freq.add(nums[i]);
        }
        return -1;
    }
}