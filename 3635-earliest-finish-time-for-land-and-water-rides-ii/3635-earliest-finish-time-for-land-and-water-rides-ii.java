class Solution {
    private int callFinishTime(int ls[], int ld[], int ws[], int wd[]){
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<ls.length; i++){
            mini = Math.min(mini, ls[i]+ld[i]);
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<ws.length; i++){
            ans = Math.min(ans, Math.max(mini, ws[i])+wd[i]);
        }
        return ans;
    }
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res1 = callFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        int res2 = callFinishTime(waterStartTime, waterDuration, landStartTime, landDuration);

        return Math.min(res1, res2);
    }
}