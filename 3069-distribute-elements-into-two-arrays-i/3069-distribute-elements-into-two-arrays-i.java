class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        temp1.add(nums[0]);
        temp2.add(nums[1]);
        int lastEleArr1 = nums[0];
        int lastEleArr2 = nums[1];
        for(int i=2;i<nums.length; i++){
            if(lastEleArr1 > lastEleArr2){
                temp1.add(nums[i]);
                lastEleArr1 = nums[i];
            }
            else{
                temp2.add(nums[i]);
                lastEleArr2 = nums[i];
            }
        }

        temp1.addAll(temp2);
        for(int i=0; i<temp1.size(); i++){
            nums[i] = temp1.get(i);
        }
        return nums;
    }
}