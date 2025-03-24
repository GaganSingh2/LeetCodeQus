class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        
        int weight = 0;
         int maxNum = 0;
        for(int i=1; i<=n*n; i++){
            weight = w * i;
            
            if(maxWeight>=weight){
                maxNum++;
                
            }else{
                break;
            }
            
        }
        return maxNum;
    }
}