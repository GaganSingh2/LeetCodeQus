class Solution {
    public String maxSumOfSquares(int num, int sum) {
        //we can't make after adding any number of 9
        if(sum > 9 * num){
            return "";
        }

        StringBuilder res = new StringBuilder("");
        while(num-- > 0){
            int digit = Math.min(9, sum); //fill at most 9's
            res.append(digit);
            sum -= digit;
        }

        return sum == 0 ? res.toString() : "";
    }
}