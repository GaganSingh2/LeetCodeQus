class Solution {
    
    public boolean uniformArray(int[] nums1) {
        int cntEven = 0, cntOdd = 0;
        if(nums1.length==1){
            return true;
        }
        for(int i=0; i<nums1.length; i++){
            if(nums1[i]%2==0){
                cntEven++;
            }
            else{
                cntOdd++;
            }
        }
        // If there are at least 2 odd elements → can form all even (odd - odd)
        // If there is at least 1 odd and 1 even → can form all odd (even - odd)

        if(cntEven==nums1.length){
            return true;
        }
        else if(cntOdd >= 2) return true;
        else if(cntOdd >= 1 && cntEven >= 1) return true;
        return false;
    }
}