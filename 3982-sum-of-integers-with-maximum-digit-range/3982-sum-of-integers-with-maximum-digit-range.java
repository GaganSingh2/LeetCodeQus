class Solution {
    public int maxDigitRange(int[] nums) {
        //Approach-1 TC:O(n.d) SC:O(1) where n is length of nums array and d is maximum number of digit in Array
        int totalSum = 0;
        int maxDiff = -1;
        for(int i=0; i<nums.length; i++){

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int val = nums[i];
            while(val > 0){
                int digit = val % 10;
                max = Math.max(max, digit);
                min = Math.min(min, digit);
                val /= 10;
            } 
            int currDiff = max - min;
            if(currDiff > maxDiff){
                totalSum = nums[i];
                maxDiff = currDiff;
            }
            else if(currDiff == maxDiff){
                totalSum += nums[i];
            }
        }
        return totalSum;

        //Approach-2 using Array Counter TC:O(n.d) SC:O(n)
        // int totalSum = 0;
        // int maxDiff = 0, cnt = 0;
        // int temp[] = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     int currDiff = 0;
        //     int max = Integer.MIN_VALUE;
        //     int min = Integer.MAX_VALUE;
        //     int val = nums[i];
        //     while(val>0){
        //         int digit = val % 10;
        //         max = Math.max(max, digit);
        //         min = Math.min(min, digit);
        //         val /= 10;
        //     }
        //     currDiff = max - min;
        //     temp[i] = currDiff;
        //     maxDiff = Math.max(maxDiff, currDiff);
        // }

        // for(int i=0; i<nums.length; i++){
            
        //     if(temp[i]==maxDiff){
        //         totalSum += nums[i];
        //         // System.out.println(temp[i]+" "+maxDiff+" "+totalSum+" h");
        //     }
        // }
        // return totalSum;
    }
}