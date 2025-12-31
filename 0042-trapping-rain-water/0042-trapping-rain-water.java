class Solution {
    public int trap(int[] height) {
        // 1st way-----------(Using Array with Prefix and Suffix)
        // int n = height.length;
        // //Calculate leftMax boundary-array
        // int leftMax[] = new int[n];
        // leftMax[0] = height[0];
        // for(int i=1; i<n; i++){
        //     leftMax[i] = Math.max(height[i],leftMax[i-1]);
        // }

        // //Calculate rightMax boundary-array
        // int rightMax[] = new int[n];
        // rightMax[n-1] = height[n-1];
        // for(int i=n-2; i>=0; i--){
        //     rightMax[i] = Math.max(height[i],rightMax[i+1]);
        // }

        // //Loop for finding the waterLevel and trapped water
        // int trappedWater = 0;
        // for(int i=0; i<n; i++){
        //     //calculate waterlevel
        //     int waterLevel = Math.min(leftMax[i],rightMax[i]);

        //     //calculate trapped water
        //     trappedWater += waterLevel - height[i];
        // }
        // return trappedWater;

        // 2nd way------------- (Using 2 Pointer)
        int si = 0, ei = height.length-1;
        int lmax = 0, rmax = 0, trapWater = 0;
        while(si<=ei){
            lmax = Math.max(lmax,height[si]);
            rmax = Math.max(rmax,height[ei]);
            if(lmax<rmax){
                trapWater += lmax - height[si];
                si++;
            }
            else{
                trapWater += rmax - height[ei];
                ei--;
            }
        }
        return trapWater;
    }
}