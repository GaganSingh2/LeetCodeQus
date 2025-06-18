class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        String cleanstr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        //Compare the character from both ends
        int left = 0, right = cleanstr.length()-1;
        while(left<right){
            if(cleanstr.charAt(left) != cleanstr.charAt(right)){
                return false;//it is not a palindrome
            }
            left++;
            right--;
        }
        return true;//it is a palindrome
    }
}