class Solution {
    private int gcd(int even, int odd){
        if(odd==0){
            return even;
        }
        return gcd(odd, even%odd);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 1;
        int sumEven = 2;
        int cntOdd = 0,cntEven=0;
        for(int i=3; i<=n*2; i++){
            if(i % 2 ==0){
                sumEven += i;
                // System.out.println("i"+i);
            }
            else{
                sumOdd += i;
            }
        }
        
        return gcd(sumEven,sumOdd);
    }
}
