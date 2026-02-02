class Solution {
    public boolean isAnagram(String s, String t) {

       //1st Approach
       if(s.length() != t.length()){
            return false;
       }
       HashMap<Character,Integer> freq = new HashMap<>();
       for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
       }

       for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(freq.get(ch) != null){
                if(freq.get(ch)==1){
                    freq.remove(ch);
                }
                else{
                    freq.put(ch,freq.get(ch)-1);
                }
            }
            else{

            }
       }
       return freq.size()==0;

        //2nd Approach-------------------
        // if(s.length() != t.length()){
        //     return false;
        // }
        // int temp[] = new int[26];
        // for(int i=0; i<s.length(); i++){
        //     char ch1 = s.charAt(i);
        //     char ch2 = t.charAt(i);
        //     temp[ch1-'a'] += 1;
        //     temp[ch2-'a'] -= 1;
        // }

        // for(int i=0; i<26; i++){
        //    if(temp[i] != 0){
        //         return false;
        //    }
        // }
        // return true;
    }
}