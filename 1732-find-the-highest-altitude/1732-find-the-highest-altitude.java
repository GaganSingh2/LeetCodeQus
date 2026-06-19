class Solution {
    public int largestAltitude(int[] gain) {

        //TC: O(n), SC: O(n)---------
        // int prefixSum[] = new int[gain.length+1];
        // int sum = 0, idx = 0;
    
        // for(int i=0; i<gain.length; i++){
        //     prefixSum[idx++] = sum;
        //     sum += gain[i];
        // }
        // prefixSum[idx] = sum;
        // int highestAlltitued = prefixSum[0];
        // for(int i=1; i<prefixSum.length; i++){
        //     // System.out.println(prefixSum[i]+" ");
        //     highestAlltitued = Math.max(highestAlltitued, prefixSum[i]);
        // }

        // return highestAlltitued;

        //TC: O(n), SC: O(1)-----------
        int prefixSum = 0, highestAlltitued = 0;
        for(int i=0; i<gain.length; i++){
            prefixSum += gain[i];
            highestAlltitued = Math.max(highestAlltitued, prefixSum);
        }

        return highestAlltitued;
    }
}