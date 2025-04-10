class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j = 0, max = 0;
        for(int i=0; i<s.length(); i++){
            HashMap<Character,Boolean> map = new HashMap<>();
            map.put(s.charAt(i),true);
            for(j=i+1; j<s.length(); j++){
                if(map.get(s.charAt(j)) == null){
                    map.put(s.charAt(j),true);
                }else break;
            }
            max = Math.max(map.size(),max);
        }
        
        return max;
    }
}