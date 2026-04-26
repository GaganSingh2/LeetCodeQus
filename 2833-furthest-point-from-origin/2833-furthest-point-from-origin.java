class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cntL = 0, cntR = 0, cntU = 0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='L') cntL++;
            else if(moves.charAt(i)=='R') cntR++;
            else cntU++;
        }

        return Math.abs(cntL - cntR) + cntU;
    }
}