class Solution {
    public int arrangeCoins(int n) {
        long si = 0, ei = n;
        while(si<=ei){
            long mid = si + (ei-si)/2;
            long usedCoin = mid * (mid + 1)/2;
            if(usedCoin == n){
                return (int)mid;
            }
            else if(n>usedCoin){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
        }
        return (int)ei;
    }
}
//Harshit Rana