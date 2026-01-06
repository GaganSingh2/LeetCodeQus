class Solution {
    public int sumFourDivisors(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
            int div = 0;
            int sum = 0;
            for(int j=1; j<=Math.sqrt(nums[i]); j++){
                //IF n is divided by j means this n also divisible by (n / j)
                if(nums[i]%j==0){
                    div += (j==nums[i]/j)? 1 : 2;
                    sum += j;
                    sum += nums[i]/j;
                }
            }
            if(div==4){
                res += sum;
            }
            System.out.println(div);
        }
        return res;
    }
}
// 21=1,3,7,21