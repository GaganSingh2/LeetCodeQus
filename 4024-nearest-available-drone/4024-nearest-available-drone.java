class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int minIdx = Integer.MAX_VALUE;
        int dis = Integer.MAX_VALUE;
        for(int i=0; i<drones.length; i++){
           
            int currDis = Math.abs(drones[i][0]-target[0]) + Math.abs(drones[i][1]-target[1]);
            // System.out.println(currDis);
            if(currDis <= drones[i][2] && dis > currDis){
                dis = currDis;
                minIdx = i;
            }
        }
        return minIdx != Integer.MAX_VALUE? minIdx: -1;
    }
}