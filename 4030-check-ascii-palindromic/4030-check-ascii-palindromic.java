class Solution {
    public boolean isPalindromic(String s) {
        
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            int asciiVal = s.charAt(i);
            
            while(asciiVal > 0){
                int digit = asciiVal % 2;
                sb.append(digit);
                asciiVal /= 2;
            }
            // System.out.println(sb);
        }
        sb.append("0");
        int si = 0, ei = sb.length()-1;
        while(si<ei){
            if(sb.charAt(si) != sb.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
}