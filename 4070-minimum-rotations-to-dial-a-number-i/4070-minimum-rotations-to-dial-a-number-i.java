class Solution {
    public int minRotations(String s) {
        int countMinRotation = 0;
        int startDigit = 0;
        for(int i=0; i<s.length(); i++){
            int currDigit = s.charAt(i) - '0';
            int diff = Math.abs(currDigit - startDigit);
            int minVal = Math.min(diff, 10 - diff);
            countMinRotation += minVal;
            startDigit = currDigit;
        }
        return countMinRotation;
    }
}