class Solution {
    public int trap(int[] height) {
        // 1st way-----------
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

        // 2nd way-------------
        int l=0,r=height.length-1,trap_water=0,lmax=0,rmax=0;
        while(l<=r){
            lmax = Math.max(lmax,height[l]);
            rmax = Math.max(rmax,height[r]);
            if(lmax<rmax){
                trap_water += lmax - height[l++]; 
            }else{
                trap_water += rmax - height[r--];
            }
        }
        return trap_water;
    }
}