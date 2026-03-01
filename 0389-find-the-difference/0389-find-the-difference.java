class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0 && t.length()==1){
            return t.charAt(0);
        }
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<t.length(); i++){
            char ch = t.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        
        for(int i=0; i<s.length(); i++){
                if(freq.get(s.charAt(i))==1){
                    freq.remove(s.charAt(i));
                }
                else{
                    freq.put(s.charAt(i), freq.get(s.charAt(i))-1);
                }
            
        }
        return (char)freq.keySet().toArray()[0];
        
    }
}