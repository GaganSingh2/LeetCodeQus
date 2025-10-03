class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        // if(numBottles == numExchange){
        //     return numExchange + 1;
        // }
        int totalDrink = numBottles;
        int empty = numBottles;
        while(empty>=numExchange){
            empty -= numExchange;   
            totalDrink++;           
            empty++;                

            numExchange++;
        }
        return totalDrink;
    }
}