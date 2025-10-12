class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        //1st Way---------TC->O(n), SC->O(n)---
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int val = entry.getKey();
            int count = entry.getValue();
            if(count%k==0){
                sum += val * count;
            }
        }
        return sum;

        //2nd way----------TC->O(nlogn), SC->O(1)--------
        // Arrays.sort(nums);
        // int sum = 0;
        // int freq = 1;
        // for(int i=1; i<=nums.length-1; i++){
        //     if(nums[i-1]==nums[i]){
        //         freq++;
        //     }
        //     else{
        //         if(freq % k == 0){
        //             sum += freq * nums[i-1];
        //         }
        //         freq = 1;
        //     }
        // }
        // if(freq%k==0){
        //     sum += freq * nums[nums.length-1]; 
        // }
        // return sum;
    }
}