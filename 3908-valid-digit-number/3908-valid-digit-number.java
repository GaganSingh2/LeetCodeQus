class Solution {
    public boolean validDigit(int n, int x) {
        boolean flag = false;
        int firVal = -1;
        while(n > 0){
            int digit = n % 10;
            if(digit==x){
                flag = true;
            }
            firVal = digit;
            n /= 10;
        }
        if(flag == true && firVal != x){
            return true;
        }
        return false;
    }
}