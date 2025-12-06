class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int idx : nums){
            sum += idx;
        }
        if(sum<k){
            return sum;
        }
        // if(sum%k==0){
        //     return 0;
        // }
        int res = 0;
        while(sum % k != 0){
            if(sum % k == 0){
                return res;
            }
            res++;
            sum--;
        }
        return res;
    }
}