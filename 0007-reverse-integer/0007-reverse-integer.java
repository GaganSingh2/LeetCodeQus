class Solution {
    public int reverse(int x) {
        long rev =0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while(x!=0){
            int rem = x%10;
            rev = rev*10 +rem;
            x/=10;
        }
        if(rev<=max && rev>=min){
            return (int)rev;
        }
        return 0;
    }
}