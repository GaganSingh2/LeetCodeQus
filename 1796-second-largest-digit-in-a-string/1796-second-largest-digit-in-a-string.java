class Solution {
    public int secondHighest(String s) {
        int firMax = Integer.MIN_VALUE;
        int secMax = firMax;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                continue;
            }
            else{
                int curr = ch-'0';
                if(firMax < curr){
                    secMax = firMax;
                    firMax = curr;
                }
                else if(secMax < curr && firMax != curr){
                    secMax = curr;
                }
            }
        }
        if(secMax == -2147483648){
            return -1;
        }
        return secMax;
    }
}