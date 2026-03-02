class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        TreeMap<Integer,Integer> freq = new TreeMap<>();

        //find all the frequency and sort in Ascending order using TreeMap
        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        
        //store the first key in this variable
        int num1 = (int)freq.keySet().toArray()[0];
        for(Integer i: freq.keySet()){
            //check second key just greater than first key is available in the map if yes then return the result
            if(i>num1 && freq.get(num1) != freq.get(i)){
                return new int[]{num1,i};
            }
        }
        return new int[]{-1,-1};
    }
}