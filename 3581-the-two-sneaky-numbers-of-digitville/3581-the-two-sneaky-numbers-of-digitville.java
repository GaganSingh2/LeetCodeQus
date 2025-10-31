class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int res[] = new int[2];
        int idx = 0;
        for(int i=0; i<=nums.length-1; i++){
            int cnt = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==i){
                    cnt++;
                }
                
            }
            // System.out.println(cnt);
            if(cnt==2){
                res[idx] = i;
                idx++;
            }
            if(idx==2){
                break;
            }
        }
        return res;
    }
}