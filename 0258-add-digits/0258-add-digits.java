class Solution {
    public int addDigits(int num) {
        int oneDigit = 0;
        while(num>0){
            oneDigit += num % 10;
            num /= 10;
            if(oneDigit>9 && num == 0){
                num = oneDigit;
                oneDigit = 0;
            }
        }
        return oneDigit;
    }
}