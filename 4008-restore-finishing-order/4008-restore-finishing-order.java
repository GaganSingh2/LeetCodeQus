class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int newArr[] = new int[friends.length];
        int id = 0;
        for(int i=0; i<order.length; i++){
            for(int j=0; j<friends.length; j++){
                if(order[i]==friends[j]){
                    newArr[id] = order[i];
                    id++;
                    break;
                }
            }
        }
        return newArr;
    }
}