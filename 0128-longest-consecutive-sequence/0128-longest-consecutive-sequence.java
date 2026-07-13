class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> freq = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            freq.add(nums[i]);
        }
        int longestConsecutive = 0;
        for(int num: freq){
            // Check if 'num' is the start of a sequence
            if(!freq.contains(num-1)){
                int currNum = num;
                int currConsecutive = 1;

                // Count how long the streak is
                while(freq.contains(currNum + 1)){
                    currNum++;
                    currConsecutive++;
                }

                longestConsecutive = Math.max(longestConsecutive, currConsecutive);
            }
            
        }
        return longestConsecutive;
    }
}