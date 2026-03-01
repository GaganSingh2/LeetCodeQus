class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(freq.containsKey(nums[i])){
                int num = Math.abs(freq.get(nums[i])-i);
                if(num<=k){
                    return true;
                }
                else{
                    freq.put(nums[i], i);
                }
            }
            else{
                freq.put(nums[i], i);
            }
        }
        return false;

       
    }
}