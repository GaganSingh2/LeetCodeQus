class Solution {
    private int getNum(int num){
        int sum = 0;
        while(num>0){
             int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        if(n==2) return false;
        if(n==1) return true;

        HashSet<Integer> visit = new HashSet<>();
        while(!visit.contains(n)){
            visit.add(n);
            n = getNum(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
}
// 25+16+1 = 42 = 16+4 = 20 = 4+0=4=16=1+36