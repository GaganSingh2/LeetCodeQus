class Solution {
    public int firstUniqChar(String s) {
        //Tc: O(n) SC: O(1)
        // int freq[] = new int[26];
        // for(int i=0; i<s.length(); i++){
        //     freq[s.charAt(i)-'a']++;
        // }
        // for(int i=0; i<s.length(); i++){
        //     if(freq[s.charAt(i)-'a']==1){
        //         return i;
        //     }
        // }
        // return -1;

        //TC: O(n) SC: O(n)
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<s.length(); i++){
            if(freq.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}