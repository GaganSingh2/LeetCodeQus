class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        n = n*n;
        int track = 0;
         int res = 0;
        for(int i=1; i<=n; i++){
            track = w * i;
            
            if(maxWeight>=track){
                res ++;
                
            }else{
                break;
            }
            
        }
        return res;
    }
}