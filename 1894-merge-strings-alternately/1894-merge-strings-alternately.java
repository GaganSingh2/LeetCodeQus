class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder("");
        int fir = 0, sec = 0;
        while(fir<word1.length() || sec<word2.length()){
            if(fir<word1.length()){
                res.append(word1.charAt(fir++));
            }
             if(sec<word2.length()){
                res.append(word2.charAt(sec++));
            }
        }

        return res.toString();
    }
}