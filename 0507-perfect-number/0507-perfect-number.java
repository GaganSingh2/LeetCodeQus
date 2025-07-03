class Solution {
    public boolean checkPerfectNumber(int num) {
        int cnt = 0;
        int i = 1;
        while(i<=num/2){
            if(num % i == 0){
                cnt += i;
            }
            i++;
        }
        if(num == cnt){
            return true;
        }
        else{
            return false;
        }
    }
}