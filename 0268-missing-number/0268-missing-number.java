class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // //case 1
        // if(nums[0]!=0){
        //     return 0;
        // }
        // // //case2 
        // if(nums[n-1]!=n){
        //     return n;
        // }
        // //case3
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return 0;


        int count = 0, sum = 0;
        for(int i=1; i<=nums.length; i++){
            count += i;
        }

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        return count - sum;

    }
}