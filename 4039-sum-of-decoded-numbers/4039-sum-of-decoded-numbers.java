class Solution {
    private long findPower(long firX, long secY, long mod){
        long res = 1;
        firX %= mod;
        while(secY > 0){
            if(secY % 2 == 1){
                res = (res * firX)%mod;
            }
            firX = (firX * firX)%mod;
            secY /= 2;
        }
        return res;
    }
    public int sumDecoded(long[] nums) {
        long res = 0;
        long mod = 1000000007L;

        for(int i=0; i<nums.length; i++){
            long num = nums[i];
            int ed = (int)(num%10);
            num /= 10;
            String temp = String.valueOf(num);
            long firX = Long.parseLong(temp.substring(0, ed));
            long secY = Long.parseLong(temp.substring(ed));

            long currVal = findPower(firX, secY, mod);
            res = (res + currVal)%mod;
        }
        return (int)res;
    }
}