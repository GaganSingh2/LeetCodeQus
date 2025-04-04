class Solution {
    public boolean isPalindrome(int x) {
        // boolean flag = true;
        // String str = String.valueOf(x);
        // int left = 0;
        // int right = str.length()-1;
        // while(left<=right){
        //     if(str.charAt(left) != str.charAt(right)){
        //         flag = false;
        //     }
        //     left++;
        //     right--;
        // }
        
        // return flag;


        // 2nd Approach

        
        if(x<0) return false;
        int temp = x;
        int res = 0;
        while(x>0){
            int digit = x%10;
            res = res * 10 + digit;
            x /= 10;
        }
       if(res == temp){
        return true;
       }else{
            return false;
       }
        

    }
}