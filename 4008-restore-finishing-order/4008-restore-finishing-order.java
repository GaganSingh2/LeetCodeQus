class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int newArr[] = new int[friends.length];
        int id = 0;

        //1st Way----- TC: O(n^2), SC: O(n)
        /*
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
        */

        //2nd Way-----------
        Set<Integer> frndSet = new HashSet<>();
        for(int frndId: friends){
            frndSet.add(frndId);
        }
        for(int ele: order){
            if(frndSet.contains(ele)){
                newArr[id] = ele;
                id++;
            }
        }
        return newArr;
    }
}