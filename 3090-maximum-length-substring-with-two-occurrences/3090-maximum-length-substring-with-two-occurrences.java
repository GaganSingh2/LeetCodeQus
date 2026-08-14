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
        if(s.length() == 2){
            return 2;
        }

        HashMap<Character, Integer> freq = new HashMap<>();
        int maxLength = 0;
        for(int i=0; i<=s.length()-2; i++){
            for(int j=i+1; j<=s.length()-1; j++){
                String str = s.substring(i,j+1);
                boolean flag = frequencyCount(str);
                if(flag){
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        return maxLength;

    }
}