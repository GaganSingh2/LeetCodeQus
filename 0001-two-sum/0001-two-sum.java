class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Using Nested Loop TC:O(n^2), SC:O(1)--------
        // for(int i=0; i<=nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if((nums[i]+nums[j])==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};
 
        //By Using HashMap TC:O(n), SC:O(n)-------
        HashMap<Integer, Integer> pairIdx = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(pairIdx.containsKey(target-num)){
                return new int[]{pairIdx.get(target-num),i};
            }
            pairIdx.put(num,i);
        }
        return new int[]{};

        // //By using two-pointer
        // int tempArr[][] = new int[nums.length][2];//we are storing bcz if we don't store then valid index we don't get
        // for(int i=0; i<nums.length; i++){
        //     tempArr[i][0] = nums[i];
        //     tempArr[i][1] = i;
        // }
        // //Sort array based on value
        // Arrays.sort(tempArr,(a,b)->Integer.compare(a[0],b[0]));

        // int si = 0, ei = nums.length-1;
        // while(si<ei){
        //     if((tempArr[si][0] + tempArr[ei][0])==target){
        //         return new int[]{tempArr[si][1], tempArr[ei][1]};
        //     }
        //     else if((tempArr[si][0] + tempArr[ei][0])<target){
        //         si++;
        //     }
        //     else{
        //         ei--;
        //     }
        // }
        // return new int[]{-1,-1};
    }
}