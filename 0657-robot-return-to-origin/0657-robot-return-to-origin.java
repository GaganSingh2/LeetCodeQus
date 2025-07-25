class Solution {
    public boolean judgeCircle(String moves) {
        int cntU = 0, cntD = 0, cntR = 0, cntL = 0;
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'U'){
                cntU++;
            }
            else if(ch == 'D'){
                cntD++;
            }
            else if(ch == 'R'){
                cntR++;
            }
            else{
                cntL++;
            }
        }
        // System.out.println(cntU+" "+cntD+" "+cntR+" "+cntL);
        if(cntU == cntD && cntL==cntR){
            return true;
        }
        return false;
        
    }
}