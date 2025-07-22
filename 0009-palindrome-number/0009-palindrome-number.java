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
        int res = 0, temp = x;
        while(temp>0){
            int dig = temp % 10;
            res = res*10+dig;
            temp /= 10;
        }
        if(x == res){
            return true;
        }
        return false;
        

    }
}