class Solution {
    public void moveZeroes(int[] nums) {
         //1st Way Optimize
        int left = 0;
        for(int right=0; right<nums.length; right++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }


        //2nd Way
    //    ArrayList<Integer> list = new ArrayList<>();
    //    int count = 0;
    //    for(int i=0; i<nums.length; i++){
    //         if(nums[i]==0){
    //             count++;
    //         }
    //         else if(nums[i] != 0){
    //             list.add(nums[i]);
    //         }
    //    }
    //    for(int i=1; i<=count; i++){
    //        list.add(0);
    //    }
    //    for(int i=0; i<nums.length; i++){
    //         nums[i] = list.get(i);
    //    }
       
    }
}