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
/**
Description and mapping of phone is given only for confusion.
we simmulate the question like
Letters 	            Add Cost
First 8 letters	          1
Next 8 letters	          2
Next 8 letters	          3
Next 8 letters	          4

if we iterate the given String i=0 to len-1
if i = 0,1,2,3,4,5,6,7         -> cost = 1
if i = 8,9,10,11,12,13,14,15   -> cost = 2
if i = 16,17,18,19,20,21,22,23 -> cost = 3
if i = 24,25                   -> cost = 4
 */