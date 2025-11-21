class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        
        int one = 0;
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1 && one == 0){
                one++;
            }
            else if(nums[i]==1 && one == 1){
                if(cnt >= k){
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
