class Solution {
    private static boolean isPalindrome(String str){
        int si = 0, ei = str.length()-1;
        while(si<=ei){
            if(str.charAt(si)!=str.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        int len = sb.length();
        for(int i=0; i<=s.length()-1; i++){
            for(int j=i; j<=s.length(); j++){
                String newStr = s.substring(i,j);
                int curLen = newStr.length();
                if(isPalindrome(newStr)){
                    if(curLen>len){
                        sb.setLength(0);
                        sb.append(newStr);
                        len = curLen;
                    }
                }
            }
        }
        return sb.toString();
    }
}