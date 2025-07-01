class Solution {
    public int possibleStringCount(String word) {
        // int temp[] = new int[26];

        // for(int i=0; i<word.length(); i++){
        //     char ch = word.charAt(i);
        //     temp[ch-'a']++;
        // }
        // int res = 1;
        // int val = 0;
        // for(int i=0; i<temp.length; i++){
        //     if(temp[i]>1){
        //         val = temp[i];
        //         val -= 1;
        //         res += val; 
        //     }
        //     val = 0;
        // }
        // return res;

        int cnt = 1;
        for(int i=1; i<=word.length()-1; i++){
            if(word.charAt(i)==word.charAt(i-1)){
                cnt++;
            }
        }
        return cnt;
    }
}