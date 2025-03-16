class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);;
        int zr=0;
        int on = 0;
        int two = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zr++;
            }
            else if(nums[i]==1){
                on++;
            }else{
                two++;
            }
        }
        int temp = 0;
        // for(int i=0;temp<nums.length && i<nums.length; i++){
        if(temp<nums.length){
            while(zr>=1){
                nums[temp] = 0;
                temp++;
                zr--;
            }
            while(on>=1){
                nums[temp] = 1;
                temp++;
                on--;
            }
            while(two>=1){
                nums[temp] = 2;
                temp++;
                two--;
            }
        }
    }
}