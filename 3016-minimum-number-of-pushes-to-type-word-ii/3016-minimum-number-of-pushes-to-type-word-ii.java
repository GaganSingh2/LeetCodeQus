class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int totalCost = 0;
        int charCnt = 0;
        for(int i=freq.length-1; i>=0; i--){
            int cnt = freq[i];
            if(cnt>0){
                if(charCnt <= 7){
                    totalCost += cnt * 1;
                }
                else if(charCnt <= 15){
                    totalCost += cnt * 2;
                }
                else if(charCnt <= 23){
                    totalCost += cnt * 3;
                }
                else{
                    totalCost += cnt * 4;
                }
                charCnt++;
            }
        }
        return totalCost;
    }
}