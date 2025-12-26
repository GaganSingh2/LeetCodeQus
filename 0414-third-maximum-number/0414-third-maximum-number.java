class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }

        Long fir = null;
        Long sec = null;
        Long trd = null;

        for(int num: nums){
            long n = num;
            if((fir != null && n==fir)
                ||(sec != null && n==sec)
                || (trd != null && n==trd))
            {
                continue;
            }
            if(fir == null || n>fir){
                trd = sec; 
                sec = fir;
                fir = n; //5
            }
            else if(sec==null || n>sec){
                trd = sec; //2
                sec = n; //4
            }
            else if(trd==null || n>trd){
                trd = n; //3
            }
        }
     
        return trd != null ? trd.intValue(): fir.intValue();
























































        // int len = nums.length;
        // Arrays.sort(nums);
        // if(nums.length==2 || nums.length==1){
        //     return nums[len-1];
        // }
        // int ren = len - 3;  
        // int cnt = 0; 
        // int max = Integer.MIN_VALUE;
        // int res = Integer.MAX_VALUE;    
        // //System.out.println(nums[ren-1]) ;              //1,2,2,3,5,5
        // for(int i=len-1; i>=0; i--){
            
        //     int prev = res;
        //     res = Math.min(res,nums[i]);
            
        //     if(prev != res){
        //         cnt++;
        //     }
        //     if(cnt==3){
        //         break;
        //     }
        // }
        // if(cnt != 3){
        //     return nums[len-1];
        // }
        // return res;
    }
}