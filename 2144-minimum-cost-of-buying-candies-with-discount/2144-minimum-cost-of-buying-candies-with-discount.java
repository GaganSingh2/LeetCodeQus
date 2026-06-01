class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==2) return cost[0] + cost[1];
        if(cost.length==1) return cost[0];

        int minCost = 0;
        Arrays.sort(cost);
        int cnt = 0;
        for(int i=cost.length-1; i>=0; i--){
            cnt++;
            if(cnt == 3){
                cnt = 0;
                continue;//skip bcz this is the 3rd candy, i.e. Free if u buy 2 canndy
            }
            minCost += cost[i];
        }
        
        return minCost;
    }
}
// 2,2,5,6,7,9