// import java.math.BigInteger;
class Solution {
    public int arraySign(int[] nums) {
        //1st Way-----
        int sign = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                sign *= -1;
            }
        }
        return sign;
        //2nd Way--------
        // BigInteger pro =  BigInteger.ONE;
        // for(int i=0; i<nums.length; i++){
        //     pro = pro.multiply(BigInteger.valueOf(nums[i]));
        // }
        // int val = pro.compareTo(BigInteger.ZERO);
        // return (val>0)?1: (val<0)?-1:0;
    }
}