class Solution {
    public long gcd(int n1, int n2){
        if(n2 == 0){
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
    public long gcdSum(int[] nums) {
        int prefixGcd[] =  new int[nums.length];
        int mxi = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            mxi = Math.max(mxi, nums[i]);
            long prefixGcdVal = gcd(nums[i], mxi);
            prefixGcd[i] = (int)prefixGcdVal;
        }
        Arrays.sort(prefixGcd);
        long sum = 0;
        int si = 0, ei = prefixGcd.length-1;
        while(si<ei){
            long val = gcd(prefixGcd[si], prefixGcd[ei]);
            sum += val;
            si++;
            ei--;
        }
        return sum;
    }
}