class Solution {
    public boolean uniformArray(int[] nums1) {
        if(nums1.length==1) return true;

        int minVal = Integer.MAX_VALUE;
        int cntOdd = 0;
        for(int i=0; i<nums1.length; i++){
            minVal = Math.min(minVal,nums1[i]);
            if(nums1[i] % 2 != 0){
                cntOdd++;
            }
        }

        if(minVal % 2 != 0){
            return true;
        }
        else if(cntOdd>0){
            return false;
        }
        
        return true;
    }

}

// Find the minimum element in the array.
// If the minimum is odd:
//      We can make all elements odd → return true
// If the minimum is even:
//    Check if there exists any odd number:
//          If yes → return false
//          Otherwise → all even → return true

// If the minimum is odd, we can use it to convert larger even numbers into odd
// If the minimum is even, we cannot convert odd numbers into even using valid subtraction