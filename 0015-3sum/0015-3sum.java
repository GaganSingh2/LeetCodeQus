class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> freq = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int si = i+1, ei = nums.length-1;
            while(si<ei){
                if(nums[i]+nums[si]+nums[ei]==0){
                    freq.add(Arrays.asList(nums[i],nums[si],nums[ei]));
                    si++;
                    while (nums[si] == nums[si-1] && si < ei) {
                        si++;
                    }
                }
                else if(nums[i]+nums[si]+nums[ei]>0){
                    ei--;
                }
                else{
                    si++;
                }
            }
        }
        return freq;
    }
}