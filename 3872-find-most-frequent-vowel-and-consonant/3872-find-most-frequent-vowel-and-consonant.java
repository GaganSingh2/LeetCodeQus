class Solution {
    public int maxFreqSum(String s) {
        int temp[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            temp[ch-'a']++;
        }
        int maxVow = 0;
        int maxCon = 0;
        for(int i=0; i<temp.length; i++){
            if((char)(i+97)=='a' || (char)(i+97)=='e' || (char)(i+97)=='i' || (char)(i+97)=='o'
            || (char)(i+97)=='u'){
                maxVow = Math.max(maxVow, temp[i]);
            }
            else{
                maxCon = Math.max(maxCon, temp[i]);
            }
        }
        
        return maxVow + maxCon;
    }
}
// 97, 101, 105, 111, 117