class Solution {
    public int[] rearrangeArray(int[] nums) {
        //---------------
        // ArrayList<Integer> pos = new ArrayList<>();
        // ArrayList<Integer> neg = new ArrayList<>();
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]<0){
        //         neg.add(nums[i]);
        //     }
        //     else if(nums[i]>0){
        //         pos.add(nums[i]);
        //     }
        // }
        // int ite = 0;
        // for(int i=0,j=0; i<pos.size() && j<neg.size();j++, i++){
        //      nums[ite] = pos.get(i);
        //      ite++;
        //      nums[ite] = neg.get(j);
        //      ite++;
        // }
        // return nums;

        // -----------------
        int pos = 0;
        int neg = 1;
        int res[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                res[pos] = nums[i];
                pos += 2;
            }
            else{
                res[neg] = nums[i];
                neg += 2;
            }
        }
        return res;
    }
}