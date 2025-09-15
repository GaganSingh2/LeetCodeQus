class Solution {
    public int earliestTime(int[][] tasks) {
        int taskTime = Integer.MAX_VALUE;
        for(int i=0; i<tasks.length; i++){
            int currTime = tasks[i][0] + tasks[i][1];
            taskTime = Math.min(currTime,taskTime);
        }
        return taskTime;
    }
}