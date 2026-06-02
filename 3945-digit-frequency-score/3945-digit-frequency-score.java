class Solution {
    public int digitFrequencyScore(int n) {
        //1st Approach-------------------TC: O(n), SC: O(1)
        // int totalSum = 0;
        // while(n>0){
        //     int digit = n % 10;
        //     totalSum += digit;
        //     n /= 10;
        // }
        // return totalSum;

        //2nd Approach------------------
        int totalSum = 0;
        int freq[] = new int[10];
        while(n>0){
            int digit = n%10;
            freq[digit-0]++;
            n /= 10;
        }
        int digit = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i]>0){
                // System.out.println(freq[i]+" "+freq[i-0])
                int currSum = freq[i] * i-0;
                totalSum += currSum;
            }
        }
        return totalSum;
    }
}