class Solution {
    public int missingMultiple(int[] nums, int k) {
        //1st Approach---- TC:O(n log n) SC: O(1)
        int smallestMissingNum = k;
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]== smallestMissingNum){
                smallestMissingNum += k;
            }
        }
        return smallestMissingNum;

        //2nd Approach---- TC: O(n) SC: O(n)
        // int smallestMissingNum = k;
        // HashSet<Integer> flag = new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     flag.add(nums[i]);
        // }
        // int cnt = 1;
        // for(int val: flag){
        //     if(!flag.contains(smallestMissingNum)){
        //         return smallestMissingNum;
        //     }
        //     else{
        //         cnt++;
        //         smallestMissingNum = k * cnt;
        //     }
        // }
        // return smallestMissingNum;
    }
}