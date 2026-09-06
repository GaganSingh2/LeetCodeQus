class Solution {
    
    public int countRotations(String s, int k) {
        int equalPairs = 0;
        
        if(s.length() <= 1) return 0;

        for(int i=0; i<s.length(); i++){
            int nxt = (i+1)%s.length();
            if(s.charAt(i) == s.charAt(nxt)){
                equalPairs++;
            }
        }

        int unEqualPairs = s.length() -  equalPairs;     
        if(equalPairs-1 == k){
            return equalPairs;
        }

        if(k == equalPairs) return unEqualPairs;
        return 0;
    }
}