class Solution {
    private long count(int cnt){
        long cntt = 0;
        for(int i=1; i<=cnt; i++){
            cntt += i;
        }
        return cntt;
    }
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
        //     if(nums[i-1]==0 && nums[i]==0){
        //         cnt++;
        //     }
        //    else if((nums[i-1]==0 && nums[i]!=0) || (nums[i-1]!=0 && nums[i]==0)){
                
        //    }
        //     else{
        //         if(cnt>0){
        //             res += count(cnt);
        //             // System.out.println(res);
        //              cnt = 0;
        //         }
               
        //     }
               if(nums[i]==0){
                cnt++;
               }
               else{
                if(cnt>0){
                    res += count(cnt);
                    cnt = 0;
                }
               }
        }
        if(cnt>0){
            res += count(cnt);
            // System.out.println(res);
            // cnt = 1;
        }
        return res;
    }
}