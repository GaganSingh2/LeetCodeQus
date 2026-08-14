class Solution {
    private boolean frequencyCount(String str){
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        for(char ch: freq.keySet()){
            if(freq.get(ch)>2){
                return false;
            }
        }
        return true;
    }
    public int maximumLengthSubstring(String s) {

        //Approach-1 --------TC: O(n), SC:O(1)
        if(s.length()==2){
            return 2;
        }
        int freq[] = new int[26]; // s consist only lowercase SC: O(1)

        int si = 0;
        int maxLength = 0;
        for(int ei=0; ei<s.length(); ei++){
            char ch = s.charAt(ei);
            freq[ch-'a']++;
            if(freq[ch-'a']>2){
                while(freq[ch-'a']>2){
                    char ch2 = s.charAt(si);
                    freq[ch2-'a']--;
                    si++;
                }
            }
            maxLength = Math.max(maxLength, ei-si+1);
        }
        return maxLength;


        //Approach-2----------------- TC:O(n^2), SC: O(n)
        // if(s.length() == 2){
        //     return 2;
        // }

        // HashMap<Character, Integer> freq = new HashMap<>();
        // int maxLength = 0;
        // for(int i=0; i<=s.length()-2; i++){
        //     for(int j=i+1; j<=s.length()-1; j++){
        //         String str = s.substring(i,j+1);
        //         boolean flag = frequencyCount(str);
        //         if(flag){
        //             maxLength = Math.max(maxLength, j-i+1);
        //         }
        //     }
        // }
        // return maxLength;

    }
}