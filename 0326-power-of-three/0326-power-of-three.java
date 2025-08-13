class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        int maxPowerOfThree = 1162261467; // 3^19, the largest power of 3 within the int range
        // System.out.println(1162261467 / n);
        return maxPowerOfThree % n == 0;
    }
}