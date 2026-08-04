class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        List<Integer> missingEle = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] != min){
                missingEle.add(min);
                i--;
            }
            min++;
        }
        return missingEle;
    }
}