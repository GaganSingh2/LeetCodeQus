class Solution {
    public int maxDistance(int[] colors) {
    
        int maxDis = Integer.MIN_VALUE;
        for(int i=0; i<colors.length; i++){
            int currDis = 0;
            for(int j=i+1; j<colors.length; j++){
                if(colors[i] != colors[j]){
                    currDis = Math.abs(i-j);
                    maxDis = Math.max(currDis,maxDis);
                }
            }
        }
        return maxDis;
    }
}