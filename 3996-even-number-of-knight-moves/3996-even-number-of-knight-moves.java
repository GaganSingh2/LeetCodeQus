class Solution {
    public boolean canReach(int[] start, int[] target) {
        int st = start[0] + start[1];
        int end = target[0] + target[1];


        if((st % 2 == 0 && end % 2 == 0) || (st % 2 != 0 && end % 2 != 0)){
            return true;
        }
        else{
            return false;
        }
    }
}
/**
The Three Possible Cases
Given start and target, there are only three scenarios:

Both are black (st % 2 == 0 and end % 2 == 0) → same color → reachable in an even number of moves → true
Both are white (st % 2 != 0 and end % 2 != 0) → same color → reachable in an even number of moves → true
One is black, one is white (different parity) → different colors → can never be reached in an even number of moves → false
 */