class Solution {
    public int numberOfSubstrings(String s) {
        int prevSeen[] = {-1,-1,-1};
        int count = 0;
        for(int i=0; i<s.length(); i++){
            prevSeen[s.charAt(i)-'a'] = i;
            if(prevSeen[0] != -1 && prevSeen[1] != -1 && prevSeen[2] != -1){
                count += 1 + Math.min(prevSeen[0],Math.min(prevSeen[1],prevSeen[2]));
            }
        }
        return count;
    }
}