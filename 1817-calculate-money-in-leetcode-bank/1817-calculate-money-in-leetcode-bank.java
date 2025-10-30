class Solution {
    public int totalMoney(int n) {
        if(n<=7){
            int tmp = n/2;
            if(n%2==0){
                return n*tmp+tmp;
            } 
            else{
                return n * (tmp+1);
            }
        }
        int coin = 28;
        int week = n / 7;
        int totalMoney = 0;
        if(n%7==0){
            while(week>=1){
                totalMoney += coin;
                week--;
                coin += 7;
            }
        }
        else{
            int tmp = week;
            while(tmp>=1){
                totalMoney += coin;
                tmp--;
                coin += 7;
            }
            
            int remDays = n - week * 7; 
            for(int i=0; i<remDays; i++){
                week++;
                totalMoney += week;
            }
        }
        return totalMoney;
    }
}