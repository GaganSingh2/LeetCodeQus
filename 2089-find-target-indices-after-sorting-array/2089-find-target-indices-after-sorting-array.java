class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        //Approach-1: TC:O(n)
        int lessCnt = 0, equalCnt = 0;
        //Count the numbers smaller than target and the numbers equal to target.
        for(int val: nums){
            if(val < target){
                lessCnt++;
            }
            else if(val == target){
                equalCnt++;
            }
        }

        List<Integer> res = new ArrayList<>();
        //The count of smaller numbers gives the starting index of the target in the sorted array.
        //Add indices from less to less + equal - 1 to the result.
        for(int i=0; i<equalCnt; i++){
            res.add(lessCnt+i);
        }
        return res;


        //Approach-2: TC: O(N log N)---------------------------
        // Arrays.sort(nums);
        // List<Integer> res = new ArrayList<>();
        // int si = 0, ei = nums.length-1;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == target){
        //         res.add(i);
        //     }
        // }
        // return res;
    }
}
//1 2 2 3 5