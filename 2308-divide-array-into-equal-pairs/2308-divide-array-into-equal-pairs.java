class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 != 0){
            return false;
        }
        Arrays.sort(nums);
        // ArrayList<Interger> li = new ArrayList<>();
        int pair = 0;
        int i = 1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                pair++;
                i+=2;
            }
            else{
                i++;
            }
        }
        if(pair == nums.length/2){
            return true;
        }else{
            return false;
        }
        
    }
}

// 2 2 2 2 3 3