class Solution {
    public int countValidPrefixes(String s) {
        int zeroCnt = 0;
        int oneCnt = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '0'){
                zeroCnt++;
            }
            else{
                oneCnt++;
            }

            if(Math.abs(zeroCnt - oneCnt)<=1){
                ans++;
            }
        }
        return ans;
    }
}