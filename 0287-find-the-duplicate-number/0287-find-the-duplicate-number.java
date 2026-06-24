class Solution {
    public int findDuplicate(int[] nums) {
        //1st Aapproach using LinkedList slow-fast pointer TC:O(n) & SC:O(1)
        int slow = nums[0];
        int fast = nums[0];
        //find the intersection point
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        //after that re-initalize the slow = nums[0] and fast at the last iterated index
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

        //2nd Approach using HashSet TC:O(n) & SC:O(n)----------------------
        // HashSet<Integer> freq = new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     if(freq.contains(nums[i])){
        //         return nums[i];
        //     }
        //     freq.add(nums[i]);
        // }
        // return -1;
    }
}