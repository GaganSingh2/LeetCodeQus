class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            //if map contains nums[i]
            if(freq.containsKey(nums[i])){
                //then found difference of currentIdx and prevIdx
                int diff = Math.abs(freq.get(nums[i])-i);
                //if diff is lessthan or equalto k then return true
                if(diff<=k){
                    return true;
                }
                else{ //otherwise update the idx in the map, may after some iteration this one is used
                    freq.put(nums[i], i);
                }
            }
            else{ //otherwise add in map
                freq.put(nums[i], i);
            }
        }
        return false;       
    }
}
