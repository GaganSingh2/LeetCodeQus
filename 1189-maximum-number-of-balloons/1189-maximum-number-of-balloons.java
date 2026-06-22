class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(ch == 'b'){
                b++;
            }
            else if(ch == 'a'){
                a++;
            }
            else if(ch == 'l'){
                l++;
            }
            else if(ch == 'o'){
                o++;
            }
            else if(ch == 'n'){
                n++;
            }
        }
        int totalCnt = 0;
        int remain_L = l / 2;
        int remain_O = o / 2;
        return Math.min(Math.min(a,b), Math.min(Math.min(remain_L,remain_O),n)); 

    }
}