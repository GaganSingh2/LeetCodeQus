class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = costs[0];
        for(int val: costs){
            max = Math.max(val, max);
        }
        int freq[] = new int[max+1];
        for(int i=0; i<costs.length; i++){
            freq[costs[i]]++;
        }
        int totalCnt = 0, sum = 0;
        for(int i=1; i<freq.length; i++){
            if(freq[i]==0){
                continue;
            }
            int canBuy = Math.min(freq[i], coins/i);
            totalCnt += canBuy;
            coins -= canBuy * i;
            if(coins < i){
                break;
            }
        }
        return totalCnt;//2+4+1
    }
}
