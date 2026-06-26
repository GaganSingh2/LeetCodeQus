class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {

        long ans = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                nums[i] = 1;
            }
            else{
                nums[i] = -1;
            }
        }
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }

        int shift = n;
        int freq[] = new int[2 * n + 1];
        freq[shift] = 1;

        long valid = 0;
        int lastSum = 0;
        for(int i=0; i<n; i++){
            if(prefix[i]>lastSum){
                valid += freq[lastSum + shift];
            }
            else{
                valid -= freq[prefix[i]+shift];
            }

            ans += valid;
            freq[prefix[i] + shift]++;
            lastSum = prefix[i];
        }
        return ans;

        //Approach-2 TC:O(n^2) SC:O(1)-----------------------
        // long ans = 0;
        // int n = nums.length;
        // for(int l=0; l<n; l++){
        //     long targetCnt = 0;
        //     for(int r=l; r<n; r++){
        //         if(nums[r]==target){
        //             targetCnt++;
        //         }

        //         int len = r - l + 1;
        //         if(targetCnt > len/2){
        //             ans++;
        //         }
        //     }
        // }
        // return ans;
    }
}