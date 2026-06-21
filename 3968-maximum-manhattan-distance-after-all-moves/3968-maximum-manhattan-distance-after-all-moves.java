class Solution {
    public int maxDistance(String moves) {
        int x = 0, y = 0;
        int underScore = 0;
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'U'){
                x++;
            }
            else if(ch == 'D'){
                x--;
            }
            else if(ch == 'L'){
                y--;
            }
            else if(ch == 'R'){
                y++;
            }
            else{
                underScore++;
            }
        }
        // System.out.println(underScore);
        return Math.abs(x) + Math.abs(y) + underScore;
    }
}