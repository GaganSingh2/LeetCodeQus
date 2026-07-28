class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int freq[] = new int[26];
        for(int i=0; i<s.length()/2; i++){
            // System.out.println(s.charAt(i));
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]>0){
                while(freq[i] != 0){
                    char ch = (char)(i+'a');
                    sb.append(ch);
                    freq[i]--;
                }
            }
        }
        StringBuilder res = new StringBuilder(sb);
        sb = sb.reverse();
        // sb = sb.deleteCharAt(0);
        if(s.length() % 2!=0){
            res.append(s.charAt(s.length()/2));
        }
        return res.append(sb).toString();
    }
}