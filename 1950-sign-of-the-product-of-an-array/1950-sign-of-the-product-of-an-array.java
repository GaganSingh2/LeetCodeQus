import java.math.BigInteger;
class Solution {
    public int arraySign(int[] nums) {
        BigInteger pro =  BigInteger.ONE;
        for(int i=0; i<nums.length; i++){
            pro = pro.multiply(BigInteger.valueOf(nums[i]));
        }
        int val = pro.compareTo(BigInteger.ZERO);
        return (val>0)?1: (val<0)?-1:0;
    }
}