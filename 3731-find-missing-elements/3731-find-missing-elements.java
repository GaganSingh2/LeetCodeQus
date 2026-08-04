class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        //Approach-1 (Sorting & Array) TC: O(nlogn)
        // Arrays.sort(nums);
        // int min = nums[0];
        // int max = nums[nums.length-1];

        // List<Integer> missingEle = new ArrayList<>();

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] != min){
        //         missingEle.add(min);
        //         i--;
        //     }
        //     min++;
        // }
        // return missingEle;

        //Approach-2 (HashSet & Array) TC: O(n)
        boolean seen[] = new boolean[101];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int ele: nums){
            min = Math.min(min, ele);
            max = Math.max(max, ele);
            seen[ele] = true;
        }

        List<Integer> missingEle = new ArrayList<>();
        for(int i=min; i<=max; i++){
            if(!seen[i]){
                missingEle.add(i);
            }
        }
        return missingEle;
    }
}