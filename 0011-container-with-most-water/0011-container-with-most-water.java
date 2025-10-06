class Solution {
    public int maxArea(int[] height) {
       int maxWater = Integer.MIN_VALUE;
       int si = 0, ei = height.length-1;
       while(si<ei){
         int minHeight = Math.min(height[si],height[ei]);
         int width = ei-si;
         int currWater = minHeight * width;
         maxWater = Math.max(currWater,maxWater);
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