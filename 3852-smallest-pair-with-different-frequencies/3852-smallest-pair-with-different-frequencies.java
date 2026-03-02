class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        TreeMap<Integer,Integer> freq = new TreeMap<>();

        //Found the Frequency for each unique key
        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        
        //bcz TreeMap is ByDefault sorted in Ascending order so the first key is our smallest value 
        int x = (int)freq.keySet().toArray()[0];
        for(Integer key: freq.keySet()){
            //then check any other key is exist in map who just greater than x and the frequency is not the same, if true then return both key
            if(x<key && freq.get(x) != freq.get(key)){
                return new int[]{x,key};
            }
        }
        //otherwise, return the inValid pair
        return new int[]{-1,-1};
    }
}