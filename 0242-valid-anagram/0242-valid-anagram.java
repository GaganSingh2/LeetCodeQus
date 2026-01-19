class Solution {
    public boolean isAnagram(String s, String t) {

       //1st Approach
       if(s.length() != t.length()){
            return false;
       }
       LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
       for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
       
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(Character k: map.keySet()){
            if(map.get(k) != 0){
                return false;
            }
        }
        return true;

        //2nd Approach
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