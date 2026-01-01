class Solution {
   
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits; //if last digit is less than 9 then +1 and return the result
            }

            digits[i] = 0; //add 0 at last 
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}