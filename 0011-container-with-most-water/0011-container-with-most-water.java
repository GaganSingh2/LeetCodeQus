class Solution {
    public int maxArea(int[] height) {
       int maxWater = 0;
       int si=0, ei=height.length-1;
       while(si<ei){
        int minHeight = Math.min(height[si],height[ei]);
        int width = ei-si;
        int area = minHeight*width;
        maxWater = Math.max(area,maxWater);
        if(height[si]<height[ei]){
            si++;
        }
        else{
            ei--;
        }
       }
       return maxWater;
    }
}