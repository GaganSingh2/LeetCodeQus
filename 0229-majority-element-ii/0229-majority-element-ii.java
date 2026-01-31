class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }

        for(Integer k: freq.keySet()){
            if(freq.get(k)>nums.length/3){
                res.add(k);
            }
        }

        return res;
    }
}