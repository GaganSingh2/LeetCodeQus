class Solution {
    public int strStr(String haystack, String needle) {
        //1st Approach -----------------------------
        // return haystack.indexOf(needle);

        //2nd Approach---------------------------
        if(needle.length() > haystack.length()){
            return -1;
        }

        for(int i=0; i<=haystack.length()-needle.length(); i++){
            int j = 0;
            //check the needle is present in haystack
            while(j<needle.length() && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }

            //if true means needle is totally present in haystack
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
}