class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int val = 0;
        int i = 1;
        while(i<=Math.sqrt(num)){
            if(num % i == 0){
                val = i * i;
                if(val == num){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}