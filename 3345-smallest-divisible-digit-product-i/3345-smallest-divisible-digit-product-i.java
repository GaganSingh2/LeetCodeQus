class Solution {
    public int smallestNumber(int n, int t) {
        int cnt = n;
        int times = n + 10;
        while(times >= n){
            int curr = cnt;
            int mul = 1;
            while(curr>0){
                int digit = curr % 10;
                mul *= digit;
                curr /= 10;
            }
            if(mul % t == 0){
                return cnt;
            }
            cnt++;
        }
        return -1;
    }
}