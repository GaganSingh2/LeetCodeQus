class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int goodPair[] = new int[spells.length];
        int idx = 0, len = potions.length;
        Arrays.sort(potions);
        for(int i=0; i<spells.length; i++){
            long val = spells[i];
            int cnt = 0;
            
            int si = 0, ei = potions.length-1;
            while(si<=ei){
                int mid = si+(ei-si)/2;
                if((val*potions[mid])>=success){
                    cnt = len-mid;
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
               
                
            }
            goodPair[idx] = cnt;
            idx++;
        }
        return goodPair;
    }
}