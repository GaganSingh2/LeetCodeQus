class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDia = Integer.MIN_VALUE;
        int maxArea = Integer.MIN_VALUE;

        for(int i=0; i<dimensions.length; i++){
           int len = dimensions[i][0];
           int bredth = dimensions[i][1];
           int currDia = ((len*len) + (bredth*bredth));
           int currArea = len * bredth;
           if(maxDia<currDia){
            maxDia = currDia;
            maxArea = currArea;
           }
           else if(maxDia==currDia && currArea>maxArea){
            maxDia = currDia;
            maxArea = currArea;
           }
           
        }
        return maxArea;
    }
}
// 9 3
// 8 6