class Solution {
    public int minimumPushes(String word) {
        int totalCost = 0;
        for(int i=0; i<word.length(); i++){
            if(i<=7){
                totalCost += 1;
            }
            else if(i<=15){
                totalCost += 2;
            }
            else if(i<=23){
                totalCost += 3;
            }
            else{
                totalCost += 4;
            }
        }
        return totalCost;
    }
}