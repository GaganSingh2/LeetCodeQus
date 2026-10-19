class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int si = 0, ei = nums.length-1;
        // while(si<ei){
        //     int mid = si + (ei - si)/2;
        //     if(nums[mid] == target){
        //         res.add(mid);
        //     }
        //     if(nums[mid] >= target){
        //         ei = mid-1;
        //     }
        //     else{
        //         si = mid+1;
        //     }
        // }
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                res.add(i);
            }
        }
        return res;
    }
}
//1 2 2 3 5