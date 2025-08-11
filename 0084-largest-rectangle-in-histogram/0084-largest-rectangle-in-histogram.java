class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int nSL[] = new int[len]; //Next Smaller Left
        int nSR[] = new int[len]; //Next Smaller Right
        Stack<Integer> temp = new Stack<>();

        //For Next Smaller Right
        for(int i=len-1; i>=0; i--){
            while(!temp.isEmpty() && heights[temp.peek()]>=heights[i]){
                temp.pop();
            }
            if(temp.isEmpty()){
                nSR[i] = len;
            }
            else{
                nSR[i] = temp.peek();
            }
            temp.push(i);
        }
        
        //For Next Smaller Left
        temp = new Stack<>();
        for(int i=0; i<len; i++){
            while(!temp.isEmpty() && heights[temp.peek()]>=heights[i]){
                temp.pop();
            }
            if(temp.isEmpty()){
                nSL[i] = -1;
            }
            else{
                nSL[i] = temp.peek();
            }
            temp.push(i);
        }
        
        //For Finding the Max Area
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<len; i++){
            int height = heights[i];
            int widht = nSR[i]-nSL[i]-1;
            int area = height * widht;
            maxArea = Math.max(maxArea,area);
            // System.out.println(maxArea);
        }
        return maxArea;
    }
}