class Solution {
    public int minBishopMoves(int[] source, int[] target) {

        //Bishop can't change square color i.e unreachable
        if((source[0]+source[1])%2 != (target[0]+target[1])%2){
            return -1;
        }
        //Same diagonal
        else if(Math.abs(source[0]-target[0]) == Math.abs(source[1]-target[1])){
            return 1;
        }

        //same color but different diagonal
        return 2;

    }
}