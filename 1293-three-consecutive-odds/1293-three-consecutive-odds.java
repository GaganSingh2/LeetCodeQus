class Solution {
    public boolean isOdd(int val){
        
        if(val % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean threeConsecutiveOdds(int[] arr) {
        int cntOdd = 0;
        for(int i=2; i<=arr.length-1; i++){
            int val1 = arr[i-2], val2 = arr[i-1], val3 = arr[i];
            if(isOdd(val1) && isOdd(val2) && isOdd(val3)){
                return true;
            }
        }
        return false;
    }
}