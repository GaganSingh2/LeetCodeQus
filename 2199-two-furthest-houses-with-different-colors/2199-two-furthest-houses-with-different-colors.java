class Solution {
    public int maxDistance(int[] colors) {
        int max_Dis = Integer.MIN_VALUE;
        int temp = 0;
        for(int i=0; i<colors.length-1; i++){
            for(int j=i+1; j<colors.length; j++){
                if(colors[i] != colors[j]){
                    temp = Math.abs(i-j);
                    max_Dis = Math.max(max_Dis, temp);
                }
            }
        }
        return max_Dis;
    }
}