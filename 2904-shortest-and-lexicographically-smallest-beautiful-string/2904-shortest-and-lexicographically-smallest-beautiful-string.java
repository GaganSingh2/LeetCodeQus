class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String beautifulStr = "";
        int left = 0;
        int cntOne = 0;
        for(int right=0; right<s.length(); right++){
            //count one in current window
            if(s.charAt(right)=='1'){
                cntOne++;
            }
            
            while(cntOne > k){
                if(s.charAt(left)=='1'){
                    cntOne--;
                }
                left++;
            }

            //remove the extra leading zeros
            while(cntOne == k && s.charAt(left) == '0'){
                left++;
            }

            if(cntOne == k){
                String temp = s.substring(left, right+1);
                if(beautifulStr.isEmpty() || temp.length()<beautifulStr.length() ||
                (temp.length() == beautifulStr.length() && temp.compareTo(beautifulStr) < 0)){
                    beautifulStr = temp;
                }
            }
        }
        return beautifulStr;
    }
}