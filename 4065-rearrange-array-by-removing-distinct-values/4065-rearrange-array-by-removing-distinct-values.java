class Solution {
    public int[] rearrangeArray(int[] nums) {
        int freq[] = new int[101];
        int maxVal = 0;
        for(int i=0; i<nums.length; i++){
            freq[nums[i] - 0]++;
            maxVal = Math.max(maxVal, freq[nums[i]]);
        }
        // System.out.println(maxVal);
        int res[] = new int[nums.length];
        int idx = 0;
        
        for(int i=0; i<maxVal; i++){
            int currIdx = 1;
            while(currIdx <= 100){
                if(freq[currIdx]>0){
                    res[idx++] = currIdx;
                    freq[currIdx]--;
                }
                currIdx++;
            }
            
        }
        return res;
    }
}