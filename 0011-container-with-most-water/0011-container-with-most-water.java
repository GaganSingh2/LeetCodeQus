class Solution {
    public int maxArea(int[] height) {
       int max_water = 0;
       int si = 0, ei = height.length-1;
       while(si<=ei){
            int hi = Math.min(height[si],height[ei]);
            int width = ei - si;
            int currWater = hi * width;
            max_water = Math.max(max_water,currWater);
            if(height[si]<height[ei]){
                si++;
            }else{
                ei--;
            }
       }
       return max_water;
    }
}