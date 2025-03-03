class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        //int temp[] = new int[len];

        for(int i=0; i<len-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        
        int count = 0;
        for(int i=0; i<len; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        
        while(count<len){
            
            nums[count++] = 0; 
        }
        
        return nums;
    }
}