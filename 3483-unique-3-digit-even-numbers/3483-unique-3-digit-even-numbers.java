class Solution {
    public int totalNumbers(int[] digits) {
        int freq[] = new int[10];
        for(int val: digits){
            freq[val-0]++;
        }

        int ans = 0;
        for(int fir=1; fir<=9; fir++){
            for(int sec=0; sec<=9; sec++){
                for(int third=0; third<=8; third+=2){
                    if(freq[fir] == 0 || freq[sec] == 0 || freq[third] == 0){
                        continue;
                    }

                    if (fir == sec && sec == third && freq[fir] < 3) {
                        continue;
                    }

                    if (fir == sec && freq[fir] < 2) {
                        continue;
                    }

                    if (fir == third && freq[fir] < 2) {
                        continue;
                    }

                    if (sec == third && freq[sec] < 2) {
                        continue;
                    }

                    ans++;
                }
            }
        }
        return ans;
    }
}