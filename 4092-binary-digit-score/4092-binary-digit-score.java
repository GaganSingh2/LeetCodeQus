class Solution {
    public int calculateScore(int a, int b) {
        int setA = 0, setB = 0;
        while(a > 0){
            int digit = a % 2;
            if(digit == 1){
                setA++;
            }
            a /= 2;
        }
        
        while(b > 0){
            int digit = b % 2;
            if(digit == 1){
                setB++;
            }
            b /= 2;
        }
        // System.out.println(setA +" "+setB);

        if(setA >= setB){
            return setA * setB;
        }
        return setB / setA;
    }
}