class Solution {
    public List<Integer> findValidElements(int[] nums) {
        ArrayList<Integer> valid = new ArrayList<>();
        if(nums.length == 1){
            valid.add(nums[0]);
            return valid;
        }

        int leftMax[] = new int[nums.length];
        int rightMax[] = new int[nums.length];
        
        int tmp = nums[0];
        for(int i=0; i<nums.length; i++){
            leftMax[i] = Math.max(tmp,  nums[i]);
            tmp = leftMax[i];
        }

        tmp = nums[nums.length-1];
        for(int i=nums.length-1; i>=0; i--){
            rightMax[i] = Math.max(tmp,nums[i]);
            tmp = rightMax[i];
        }

        valid.add(nums[0]);
        for(int i=1; i<=nums.length-2; i++){
            if(nums[i]>leftMax[i-1] || nums[i]>rightMax[i+1]){
                valid.add(nums[i]);
            }
        }
        valid.add(nums[nums.length-1]);
        return valid;
        
    }
}