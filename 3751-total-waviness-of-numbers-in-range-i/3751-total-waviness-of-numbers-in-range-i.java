class Solution {

    private int sumOfWaviness(int n){
        int cnt = 0;
        String s = Integer.toString(n);
        for(int i=1; i<s.length()-1; i++){
            char curr = s.charAt(i);
            if((curr>s.charAt(i-1) && curr > s.charAt(i+1)) || //peak means neighbors are strictly greater than of currDigit
                (curr < s.charAt(i-1) && curr < s.charAt(i+1))){ //valley means neighbors are strictly less than of currDigit
                    cnt++;
            }
        }

        return cnt;
    }
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int n=num1; n<=num2; n++){
            ans += sumOfWaviness(n);//find waviness for each number in the given range
        }

        return ans;
    }
}