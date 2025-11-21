class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int idx = -1;
        int one = 0;
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1 && one == 0){
                idx = i;
                one++;
            }
            else if(nums[i]==1 && one == 1){
                // idx = Math.abs(cnt - idx);
                if(cnt >= k){
                    idx = i;
                    one = 1;
                    cnt = 0;
                }
                else{
                    return false;
                }
            }
            else if(nums[i]==0 && one != 0){
                cnt++;
            }
        }
        return true;
    }
}
