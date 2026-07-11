class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int res = 0;
        for(int val: freq.keySet()){
            if(k>0 && freq.containsKey(val + k) || k==0 && freq.get(val)>1){
                res++;
            }
        }
        return res;
    }
}