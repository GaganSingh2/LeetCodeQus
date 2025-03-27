class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder("");
        int firStr = 0;
        int secStr = 0;
        while(firStr<word1.length() || secStr<word2.length()){
            if(firStr<word1.length()){
                res.append(word1.charAt(firStr++));
            }
            if(secStr<word2.length()){
                res.append(word2.charAt(secStr++));
            }
        }

        return res.toString();
    }
}