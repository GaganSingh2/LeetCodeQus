class Solution {
    public int missingMultiple(int[] nums, int k) {
        int smallestMissingNum = k;
        HashSet<Integer> flag = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            flag.add(nums[i]);
        }
        int cnt = 1;
        for(int val: flag){
            if(!flag.contains(smallestMissingNum)){
                return smallestMissingNum;
            }
            else{
                cnt++;
                smallestMissingNum = k * cnt;
            }
        }
        return smallestMissingNum;
    }
}