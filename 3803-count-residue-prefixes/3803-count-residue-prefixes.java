class Solution {
    public int residuePrefixes(String s) {
        boolean check[] = new boolean[26];
        int ans = 0, count = 0;
        for(int i=0; i<s.length(); i++){
            if(!check[s.charAt(i)-'a']){
                ++count;
                check[s.charAt(i)-'a'] = true;
            }
            if(((i+1)%3)==count){
                ++ans;
            }
        }
        return ans;
    }
}