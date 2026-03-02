class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        TreeMap<Integer,Integer> freq = new TreeMap<>();

        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        int num1 = -1;
        num1 = (int)freq.keySet().toArray()[0];
        for(Integer i: freq.keySet()){
            if(i>num1 && freq.get(num1) != freq.get(i)){
                return new int[]{num1,i};
            }
        }
        return new int[]{-1,-1};
    }
}