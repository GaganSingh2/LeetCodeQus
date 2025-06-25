class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int j = 0,i=0;
        while(i<nums.length && j<nums.length){
            if((Math.abs(i-j)<=k) && (nums[j]==key)){
                res.add(i);
                i++;
            }
            else if(nums[j] != key){
                j++;
            }
            // else if((Math.abs(i-j)>k) && (nums[j]==key)){
            //     j++;
            // }
            else if(Math.abs(i-j)>k && j<i){
                j++;
            }
            else if(Math.abs(i-j)>k){
                i++;
            }
        }
        return res;
    }
}