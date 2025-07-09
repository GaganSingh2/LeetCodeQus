class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long si = 1, ei = num;
       
        while(si<=ei){
             long mid= si+(ei-si)/2;
            long square = mid * mid;
            if(square == num){
                return true;
            }
            else if(square > num){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
            
        }
         return false;

        // if(num == 1) return true;
        // int val = 0;
        // int i = 1;
        // while(i<=Math.sqrt(num)){
        //     if(num % i == 0){
        //         val = i * i;
        //         if(val == num){
        //             return true;
        //         }
        //     }
        //     i++;
        // }
        // return false;
    }
}