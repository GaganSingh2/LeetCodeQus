class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int si = 0, ei = letters.length-1;
        char result = letters[0];
        while(si<=ei){
            int mid = (si+ei)/2;
            if(letters[mid]>target){
                result = letters[mid];
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
       return result;
    }
}