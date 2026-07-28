class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int freq[] = new int[26];

        //count the frequency of half of the given string s
        for(int i=0; i<s.length()/2; i++){
            // System.out.println(s.charAt(i));
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        //append into the characters based on the frequency into the newly StringBuilder
        for(int i=0; i<freq.length; i++){
            if(freq[i]>0){
                while(freq[i] != 0){
                    char ch = (char)(i+'a');
                    sb.append(ch);
                    freq[i]--;
                }
            }
        }
        //store temp stringbuilder into the result stringbuilder
        StringBuilder res = new StringBuilder(sb);

        //then reverse the temp stringbuilder to build second half of the string (bcz in palindrome second half of string is just opposite of the first half of the string)
        // sb = sb.reverse();
        
        //if the length is odd type so add middle character of given string into result stringbuilder before the second half string is going to store into the result stringbuilder
        if(s.length() % 2!=0){
            res.append(s.charAt(s.length()/2));
        }
        for(int i=sb.length()-1; i>=0; i--){
            res.append(sb.charAt(i));
        }
        return res.toString();
    }
}