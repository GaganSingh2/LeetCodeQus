class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i=nums.length-1; i>=0; i--){
            int val = nums[i];
            while(val>0){
                int digit = val % 10;
                tmp.add(digit);
                val /= 10;
            }

        }
        int res[] = new int[tmp.size()];
        int idx = res.length-1;
        for(int i=0; i<tmp.size(); i++){
            res[idx] = tmp.get(i);
            idx--;
        }
        return res;
    }
}