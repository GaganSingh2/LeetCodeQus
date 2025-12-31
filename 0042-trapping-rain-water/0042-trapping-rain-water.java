class Solution {
    public int trap(int[] height) {
////         1st way-----------(Using Array with Prefix and Suffix)
        // int len = height.length;
        // //Left Max Boundry
        // int lmax[] = new int[len];
        // lmax[0] = height[0];
        // for(int i=1; i<len; i++){
        //     lmax[i] = Math.max(height[i],lmax[i-1]); // [4,4,4,4,4,5]
        // } 
        //  //Left Max Boundry
        // int rmax[] = new int[len];
        // rmax[len-1] = height[len-1];
        // for(int i=len-2; i>=0; i--){
        //     rmax[i] = Math.max(height[i],rmax[i+1]); // [5,5,5,5,5,5]
        // }
        // //Find the trapWater
        // int trapWater = 0;
        // for(int i=0; i<len; i++){
        //     int currWidth = Math.min(rmax[i],lmax[i]);

        //     trapWater += currWidth - height[i]; //9
        // }
        // return trapWater;

        // 2nd way------------- (Using 2 Pointer)
        // int si = 0, ei = height.length-1;
        // int lmax = 0, rmax = 0, trapWater = 0;
        // while(si<=ei){
        //     lmax = Math.max(lmax,height[si]);
        //     rmax = Math.max(rmax,height[ei]);
        //     if(lmax<rmax){
        //         trapWater += lmax - height[si];
        //         si++;
        //     }
        //     else{
        //         trapWater += rmax - height[ei];
        //         ei--;
        //     }
        // }
        // return trapWater;


        //3rd Way-------------------(Using Stack)
        Stack<Integer> leftH = new Stack<>();
        int rightBoundary = 0;
        
        int trapWater = 0;
        for(int i=0; i<height.length; i++){
            while(!leftH.isEmpty() && height[i]>height[leftH.peek()]){
               
                int bottomHeight = leftH.pop();
                if(leftH.isEmpty()){
                    break;
                }
                int leftBoundary = leftH.peek();
                rightBoundary = i;
                int dis = i - leftBoundary - 1;
                int boundedHeight = Math.min(height[leftBoundary],height[rightBoundary]) - height[bottomHeight];
                trapWater += dis * boundedHeight;
                
            }
            leftH.push(i);
        }
        return trapWater;
    }
}