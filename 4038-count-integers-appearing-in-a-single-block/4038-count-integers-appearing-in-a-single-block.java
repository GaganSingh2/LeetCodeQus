class Solution {
    public int countSpecialIntegers(int[] nums) {
        int maxEle = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            maxEle = Math.max(maxEle, nums[i]);
        }

        int freq[] = new int[maxEle+1];
        freq[nums[0]] = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                freq[nums[i]]++;
            }
        }
        int cnt = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i]==1){
                cnt++;
            }
        }
        return cnt;
    }
}