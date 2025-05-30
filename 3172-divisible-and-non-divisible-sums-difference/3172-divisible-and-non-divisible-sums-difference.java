class Solution {
    public int differenceOfSums(int n, int m) {
        int not_Divisible = 0, is_Divisible = 0;
        for(int i=1; i<=n; i++){
            if(i % m != 0){
                not_Divisible += i;
            }
            else{
                is_Divisible += i;
            }
        }
        return not_Divisible - is_Divisible;
    }
}