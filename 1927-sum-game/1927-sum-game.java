class Solution {
    public boolean sumGame(String num) {
        int len = num.length();
        int firHalfSum = 0, secHalfSum = 0;
        int cntQuestionMarkFirHalf = 0, cntQuestionMarkSecHalf = 0;

        //First Half checking
        for(int i=0; i<len/2; i++){
            if(num.charAt(i) == '?'){
                cntQuestionMarkFirHalf++;
            }
            else{
                firHalfSum += num.charAt(i)-'0';
            }
        }

        //Second half checking
        for(int i=len/2; i<len; i++){
            if(num.charAt(i) == '?'){
                cntQuestionMarkSecHalf++;
            }
            else{
                secHalfSum += num.charAt(i)-'0';
            }
        }

        return (firHalfSum - secHalfSum)*2 != (cntQuestionMarkSecHalf - cntQuestionMarkFirHalf) * 9;
    }
}