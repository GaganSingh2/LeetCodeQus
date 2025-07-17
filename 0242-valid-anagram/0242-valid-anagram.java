class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int temp[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            temp[ch1-'a'] += 1;
            temp[ch2-'a'] -= 1;
        }

        for(int i=0; i<26; i++){
           if(temp[i] != 0){
                return false;
           }
        }
        return true;
    }
}