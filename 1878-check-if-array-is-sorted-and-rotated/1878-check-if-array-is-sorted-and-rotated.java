class Solution {
    public boolean check(int[] nums) {
        int spike = 0;
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            if (nums[i]<=nums[i+1]) {
                continue;
            }
            else{
                spike++;
            }
        }
        if (nums[n-1]<=nums[0]) {
            
        }
        else{
            spike++;
        }
        System.out.println(spike);
        if (spike>1) {
            return false;
        }
        return true;
        
    }
}