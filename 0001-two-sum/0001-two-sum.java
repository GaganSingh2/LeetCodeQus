class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Using Nested Loop TC:O(n^2), SC:O(n)--------
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
    }
}