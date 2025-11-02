class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        List<Integer> res = new ArrayList<>();
        boolean flag = false;
        for(int i=min; i<=max; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[j]==i){
                    flag = true;
                    break;
                }
                
            }
            if(!flag){
                res.add(i);
            }
            flag = false;
        }
        return res;
    }
}