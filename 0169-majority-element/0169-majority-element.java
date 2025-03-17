class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int len = nums.length;
        int res = 0;
        Arrays.sort(nums);
        for(int i=0; i<=nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count > len/2){
                return nums[i];
            }
            count = 1;
        }
        if(count > len/2){
            res = nums[len-1];
        }
        return res;
    }
}
// class Solution {
//     public int majorityElement(int[] nums) {
//         return majorityELementRec(nums,0,nums.length-1);
//     }
//     private static int countInRange(int nums[],int num, int lo,int hi){
//         int count = 0;
//         for(int i=lo; i<=hi; i++){
//             if (nums[i]==num) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     private static int majorityELementRec(int nums[],int lo,int hi){
//         //Base case
//         if(lo==hi){
//             return nums[lo];
//         }

//         //Divide
//         int mid = lo+(hi-lo)/2;
//         int left = majorityELementRec(nums, lo, mid);//left part
//         int right = majorityELementRec(nums, mid+1, hi);//right part

//         //if the two halves agree on the mmajority element,return it
//         if(left==right){
//             return left;
//         }

//         //Otherwise, count each element and return the "winners"
//         int leftCount = countInRange(nums, left, lo, hi);//left parrt
//         int rightCount = countInRange(nums, right, lo, hi);

//         return leftCount>rightCount ? left:right;

//     }
// }