class Solution {
    public int minimumDistance(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        if(nums.length==3){
            if(nums[0] != nums[1] || nums[1] != nums[2] || nums[0]!= nums[2]){
                return -1;
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i=0; i<=nums.length-2; i++){
            for(int j=i+1; j<=nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k] && nums[i]==nums[k]){
                        int sum = Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        res = Math.min(sum,res);
                    }
                }
            }
        }
        if(res==2147483647){
            return -1;
        }
        return res;
    }
}