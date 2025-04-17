class Solution {
    public int countPairs(int[] nums, int k) {
        int pair = 0;
        int idx = 0;
        for(int i=0; i<=nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    idx = i*j;
                    if(idx % k == 0){
                        pair++;
                    }
                }
            }
        }
        return pair;
    }
}