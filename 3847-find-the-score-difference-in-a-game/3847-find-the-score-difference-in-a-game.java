class Solution {
    public int scoreDifference(int[] nums) {

        int firPlayerPoints = 0, secPlayerPoints = 0;
        boolean firPlayerActive = true;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2!=0){
                firPlayerActive = !firPlayerActive;
            }
            if(i % 6==5){
                firPlayerActive = !firPlayerActive;
            }

            if(firPlayerActive){
                firPlayerPoints += nums[i];
            }
            else{
                secPlayerPoints += nums[i];
            }
        }
        return firPlayerPoints - secPlayerPoints;



        // int firPlayerPoints = 0, secPlayerPoints = 0;
        // boolean firPlayerActive = true;
        // boolean secPlayerActive = false;
        // int cntGame = 0;
        // for(int i=0; i<nums.length; i++){
        //     cntGame++;
        //     if(nums[i]%2!=0){
        //         if(firPlayerActive){
        //             firPlayerActive = false;
        //             secPlayerActive = true;
        //         }
        //         else{
        //             firPlayerActive = true;
        //             secPlayerActive = false;
        //         }
        //     }
        //     if(cntGame==6){
        //         if(firPlayerActive){
        //             firPlayerActive = false;
        //             secPlayerActive = true;
        //             cntGame = 0;
        //         }
        //         else{
        //             firPlayerActive = true;
        //             secPlayerActive = false;
        //             cntGame = 0;
        //         }
        //     }
        //     if(firPlayerActive){
        //         firPlayerPoints += nums[i];
        //     }
        //     else{
        //         secPlayerPoints += nums[i];
        //     }
        // }
        // // System.out.println(firPlayerPoints+" "+secPlayerPoints);
        // return firPlayerPoints - secPlayerPoints;
    }
}