class Solution {
    public int[] numberOfPairs(int[] nums) {
        int freq[] = new int[101];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]-0]++;
        }

        int pair = 0, leftOver = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i]==0){
                continue;
            }
            else{
                pair += freq[i]/2;
                leftOver += freq[i]%2;
            }
        }
        return new int[]{pair,leftOver};
    }
}