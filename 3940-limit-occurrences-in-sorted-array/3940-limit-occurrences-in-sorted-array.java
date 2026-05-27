class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        int cnt = 1;
        temp.add(nums[0]);

        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                cnt++;
            }
            else{
                cnt = 1;
            }

            if(cnt <= k){
                temp.add(nums[i]);
            }
        }
        int res[] = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            res[i] = temp.get(i);
        }
        return res;
    }
}